# This example program is meant to demonstrate errors.
 
# There are some errors in this program, try run the program by pressing F5.
# Now look at the error messages and find and fix the errors.

print("Welcome to the error program")
print("\n")

ageStr = "24" #I'm 24 years old.
age = int(ageStr)
print("I'm" + " " + str(age) + " " + "years old.")
three = "3"

answerYears = age + int(three) + 0.5

print ("The total number of years:" + str(answerYears))

answerMonths = answerYears * 12

print("In 3 years and 6 months, I'll be " + str(answerMonths) + " months old")

#HINT, 330 months is the correct answer

