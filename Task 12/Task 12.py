import math

inp = ""
print("Choose either 'investment' or 'bond' from the menu below to proceed:\n investment - to calculate the amount of interest you'll earn on interest. \n bond - to calculate the amount you'll have to pay on a home loan. ")
inp = input("Choose either 'investment' or 'bond': ").lower()
if inp != "investment" and inp != "bond":
    print("Please enter investment or bond: ")
print("--------------------------------------------------------------------------")

if inp == "investment" :
        P = float(input("Please enter the amount of money you will be depositing: "))#The amount being deposited
        r = float(input("Please enter the interest rate: "))#The interest rate
        t = float(input("Please enter in years the amount of time you plan on investing: "))#the amount of time they will be investing for
        type_of_interest = input("Please enter wheither you would like 'simple' of 'compound' interest: ").lower()#the user must enter simple or compound

        while(type_of_interest != "simple" and type_of_interest != "compound"):
            type_of_interest = input("Please enter wheither you would like 'simple' of 'compound' interest: ").lower()
            
        if type_of_interest == "simple":
                A = P * (1 + r*t) #simple interest formula
                print(A)
        if type_of_interest == "compound":
                A = P * math.pow((1+r),t) #compound interest formula
                print(A)
        

if inp == "bond":
    PV = float(input("Please enter the present value of your house: "))#value of the user's house
    r = float(input("Please enter the interest rate: "))#the interest rate of the house
    n = float(input("Please enter the number of months over the bond will be repaid: "))#the number of months 
    A = PV((r(1 + r)*n)/(1 + r)*n-1)
    print(A)
     

    
    

    
            
            
        


                

            
        
 
