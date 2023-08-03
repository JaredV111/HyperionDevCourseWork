import math

inp = ''
print("Choose either 'investment' or 'bond' from the menu below to proceed:\n invesment - to calculate the amount of interest you'll earn on interest\nbond - to calculate the amount you'll have to pay on a home loan\n")
inp =  input("Please enter 'investment' or 'bond'\n").lower

if inp != 'investment' and inp != 'bond':
    print("Please enter investment or bond: ")

print("------------------------------------------------------------------------------")

if inp == 'investment':
    amount_depositing = float(input("Please enter the amount of money depositing"))#amount being deposited
    interest_rate = float(input("Please enter the interest rate(not as a percentage"))#the interest rate
    number_of_years = float(input("Please enter the number of years planned on investing"))#number of years being invested
    
    while (type_of_interest != 'simple' and type_of_interest != 'compound'):
        type_of_interest = input("Please enter whether you would like 'simple' or 'compound' interest: ").lower()

    if type_of_interest == 'simple':
        A = amount_depositing * (1 + interest_rate* number_of_years)#simple interest formula
        print(A)

    if type_of_interest == 'compound':
        A = amount_depositing * math.pow((1 + interest_rate), number_of_years) #compound interest formula
        print(A)



