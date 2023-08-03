haveLength = False
lowCase = False
upCase = False
haveNum = False

length = input("How long is the password: ")
LowerCase = input("Does it have lowercase in it: ")
UpCase = input("Does it have uppercase in it: ")
DoesNum = input("Does it contain numbers: ")

int_length = int(length)
if (int_length > 6):
    haveLength = True
elif (int_length < 6):
    haveLength = False 

if (LowerCase == "Yes" or LowerCase == "yes"):
    LowCase = True
elif(LowerCase =="No" or LowerCase == "no"):
    lowCase = False 

if (UpCase == "Yes" or UpCase == "yes"):
    Upcase = True
elif(UpCase == "No" or UpCase == "no" ):
    upcase = False 

if (DoesNum == "Yes" or DoesNum == "yes"):
    DoesNum = True
elif(DoesNum == "No" or DoesNum == "no"):
    doesNum = False 

if(haveLength == True and LowCase == True and Upcase == True ):
        print("suitable password")

if(haveLength == True and LowCase == True and DoesNum == True):
        print("suitable password")
    
if(haveLength == True and DoesNum == True and Upcase == True):
        print("suitable password")

if(DoesNum == True and LowCase == True and Upcase == True):
        print("suitable password")

    

    
