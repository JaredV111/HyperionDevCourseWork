# ================================
# K-means algorithm implementation
# =================================

import csv
import random
from math import sqrt

# Function that reads data in from the csv files.
def readCSV(file):
	csvFile = open(file, 'r')
	csvRead = csv.reader(csvFile, delimiter=',')
	next(csvRead)
	dataStore = [[row[0], [float(row[1]), float(row[2])]] for row in csvRead]
	csvFile.close()
	return dataStore

# Function that computes the Euclidean distance between two data points.
def calcDist(point1, point2):
	return sqrt((point1[0]-point2[0])**2 + (point1[1]-point2[1])**2)

# Function that reads data in from the csv files.
def calcMean(points):
	unzipped = list(zip(*points))
	x = sum(unzipped[0])
	y = sum(unzipped[1])
	return [x/len(points), y/len(points)]

# Function that calculates the the within-cluster sum of squares
def calcObj(centroid, points):
	distances = [calcDist(centroid, p) for p in points]
	return round(sum(distances), 2)

# Get the names of the countries belonging to a cluster
def getCountries(clusterPoints, data):
	countries = []
	for i, value in enumerate(data):
		if value[1] in clusterPoints:
			countries.append(data[i][0])
	return countries

# ========================
# Initialization procedure
# ========================

# Read in data from a csv file
dataSet = readCSV("dataBoth.csv")
#dataSet = readCSV("data1953.csv")
#dataSet = readCSV("data2008.csv")


# Extract data points
dataPoints = [dataList[1] for dataList in dataSet]

# Take in a user-defined number of clusters
while True:
	try:
		k = int(input("Enter the number of clusters you would like: "))
		break
	except ValueError:
		print("Oops! That was not a valid number. Please try again...")

# Take in a user-defined number of iterations
while True:
	try:
		n = int(input("Enter the maximum number of iterations you would like: "))
		break
	except ValueError:
		print("Oops! That was not a valid number. Please try again...")

# Randomly select initial centroids from the data points
centroids = random.sample(dataPoints, k)

# ==================
# Implement the K-means algorithm
# ==================

# Set the number of iterations to zero
iterations = 0

# Repeat while the maximum number of iterations has not been reached
while True:

	# Count iterations
	iterations += 1

	# Store the closes points to each cluster here
	closest = [[] for i in range(k)]
	
	# Repeat for each data point
	for dataPoint in dataPoints:

		# Store the distances from the point to each centroid
		sqDistances = []

		# Calculate the point's distance to each centroid
		for i in range(k):
			sqDistances.append(calcDist(centroids[i], dataPoint))

			# Assign the point to its nearest centroid
		for i, value in enumerate(sqDistances):
			if value == min(sqDistances):
				closest[i].append(dataPoint)

	# Calculate the new centroids
	for i in range(k):
		centroids[i] = calcMean(closest[i])

	# For each cluster, calculate the object function and print out the value
	print ("Iteration:", iterations)
	for i in range(k):
		print ("Cluster", i ,"objective function value:", calcObj(centroids[i], closest[i]))

	# End if the iteration limit has been reached
	if iterations == n:
		print()
		print ("All", n ,"iterations have been completed! See results below...")
		break

# ==================
# Print results
# ==================

print ("-------------------------------")
print ("Number of Countries per Cluster")
print ("-------------------------------")

# Return the number of countries belonging to each cluster
for i in range(k):
	print ("Cluster " + str(i) + ":", len(closest[i]), "countries.")

print ("-----------------------------------------------")
print ("Avg. Birth Rate and Life Expectancy per Cluster")
print ("-----------------------------------------------")

# Print the average birth rate and average life expectancy for each cluster
for i in range(k):
        print ("Cluster " + str(i) + ": avg. birth rate is " + str(round(centroids[i][0], 2)) + "; avg. life expectancy is " + str(round(centroids[i][1], 2)) + ".")

print ("-----------------------------------")
print ("Countries Belonging to Each Cluster")
print ("-----------------------------------")

# Return a list of countries belonging to each cluster
for i in range(k):
        print ("Cluster "+ str(i) + ": \n" ,getCountries(closest[i], dataSet))