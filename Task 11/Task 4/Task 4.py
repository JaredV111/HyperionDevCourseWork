num1 = int(input("Enter an integer: "))
if num1 % 2 == 0 and num1 % 5 == 0:
    print(num1, "is divisible by 2 or 5. ")
elif num1 % 2 == 0 or num1 % 5 == 0:
        print(num1, "is divisble by 2 and 5. ")
else :
    print(num1, "is not divisible by 2 and 5. ")
