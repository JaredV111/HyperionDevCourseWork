def areacalculator():
    shape = input("Enter the shape of the building. Is it square,rectangle or round : ")
    area = 0
    import math
    pie = math.pi
#area of square
    if shape == "square" :
        side = float(input("Enter the value of side: "))
        area = area + (side ** 2)
#area of rectangle 
    elif shape == "rectangle" :
        length = float(input("Enter the value of the length: "))
        width = float(input("Enter the value of the width: "))
        area = area + (length * width)
#area of a circle
    elif shape == "round":
        radius = float(input("Enter the value of the radius: "))
        area = area + (2 * pie * radius)
    else:
        print("select a valid shape")
    print("%.2f" % area)

areacalculator()
