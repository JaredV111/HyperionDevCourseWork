names = []
new_name = " "
while new_name != "Stop ":  
    new_name = input("enter a new name, or enter Stop : ")
    if new_name != "Stop ":
        names.append(new_name)
        print(names)
