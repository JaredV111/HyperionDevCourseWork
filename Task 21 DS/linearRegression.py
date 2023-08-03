from sklearn.datasets import load_diabetes
from sklearn import linear_model
from statistics import mean
import numpy as np
import matplotlib.pyplot as plt
from matplotlib import style
import matplotlib.patches as mpatches

style.use('fivethirtyeight')

#Load Diabetes datasets
d = load_diabetes()
d_X = d.data[: np.newaxis,2]
xs_train = d_X[:-20]
ys_train = d.target[:-20]
xs_test = d_X[-20:]
ys_test = d.target[-20:]

def best_fit_slope_and_intercept(xs, ys):
    
    # Calculation for the slope of the best_fit_line
    m = ( ((mean(xs) * mean(ys)) - mean(xs * ys)) /
          ((mean(xs) * mean(xs)) - mean(xs * xs)) )
    
    # Calculation for the y-intercept for the best_fit_line
    b = mean(ys) - m * mean(xs)

    return m, b

m, b = best_fit_slope_and_intercept(xs_train, ys_train)

regression_line = [(m * x) + b for x in xs_test]

predict_x = 8
predict_y = (m * predict_x) + b
#Scatter the data
plt.scatter(xs_train, ys_train, color = 'r')
plt.scatter(xs_test, ys_test, color = 'g')
plt.plot(xs_test, regression_line, color = 'b')
#Set Legend colors
red_patch = mpatches.Patch(color = 'red', label = "Red Test Data")
green_patch = mpatches.Patch(color = 'green', label = "Green Test Data")
blue_line = mpatches.Patch(color = 'blue', label = "Regression Line")
#Print legend and set location
plt.legend(handles = [red_patch, green_patch, blue_line], loc='upper left')

plt.show()
