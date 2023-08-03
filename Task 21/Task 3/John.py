incorrect_names = []
names = input("Enter your name: ")
while names != 'John': # while loop
    incorrect_names.append(names)
    names = input("Enter your name: ")#entering names 
print(incorrect_names)
