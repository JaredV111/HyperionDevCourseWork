
numStr = input("Enter a number: ")
if numStr == "2":
    numInt = int(numStr)
    #string input was cast to int (tested with print numInt*2 function)
elif numStr == "3":
     numInt = int(numStr)
     #string input was cast to int (tested with print numInt*2 function)
elif numStr == "NO":
    print ("No can't be cast to an int.")
    #entering NO caused the print function to be executed.
    
#Entering anything other than 2, 3 or NO did not result in any output as the option was not defined in the code.
#Use else function to create output for other inputs.

