num1 = 12
num2 = 34
num3 = 45
if num1 >=num2:
    print("num1 is greater than or equal to num2.")
elif num1 <= num2:
    print("num2 is greater than or equal to num1.")


    num1 = 12
if (num1 % 2) == 0:
   print("{0} is Even".format(num1))
else:
   print("{0} is Odd".format(num1))


numb1 = int(input("enter num1: "))
numb2 = int(input("enter num2: "))
numb3 = int(input("enter num3: "))
numbers = [numb1, numb2, numb3]
numbers.sort()
print(numbers) 
