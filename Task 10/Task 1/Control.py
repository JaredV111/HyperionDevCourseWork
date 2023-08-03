age_str = input("enter your age: ")
age = int(age_str)
if age >= 18: 
    print("You are old enough! ")
elif 16 < age < 18:
    print("Almost there.")
elif age < 16:
    print("You are just too young!")
