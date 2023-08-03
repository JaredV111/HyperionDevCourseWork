weight = input("enter your weight in kilograms: ")
height = input("enter your height in meters: ")
weight_flo = float(weight)
height_flo = float(height)

BMI = (weight_flo) / ((height_flo)*(height_flo))

if BMI > 30:
    print("You are obese.")
elif 25 < BMI < 30:
    print("You are overweight.")
elif 18.5 < BMI < 25:
    print("You are normal weight.")
elif BMI <18.5:
    print("You are underweight.")
