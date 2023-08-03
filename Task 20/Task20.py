from datetime import date
today = date.today()
today = today.strftime("%B %d %Y")
str(today)

close = False
login = False
logged_in = False

    #while logged_in == False:

f = open("user.txt","r")
words = (f.readline())
username = (words[0:5])
password = (words[7:12])
f.close()
print(username)
print(password)
        
while logged_in == False:
    in_user = input("Please enter the username: ")
    in_pass = input("Please enter a password: ")
    if in_user == username and in_pass == password:
        logged_in = True
    else:
        print("Error please try again")
            
while close == False:              
    while logged_in == True:
        option = input("Please select one of the following options:\n r - register user\n a - add task\n va - view all tasks\n vm - view my tasks\n e - exit\n")
        #option = option.lower
        if option == "r":
            newusr = input("Please enter new username: ")
            newpsswrd = input("Please enter new password: ")
            f = open("user.txt","a")
            f.write(" ,"+newusr+" ,"+newpsswrd)
            f.close()
        
        if option == "a":
            f = open("tasks.txt","a")
            new_task1 = input("Please enter enter the username of the person the task is assigned to: ")
            new_task2 = input("Please enter the title of the task: ")
            new_task3 = input("Please enter a description of the task:  ")
            new_task4 = input("Please enter the due date of the task: ")
            f.write(new_task1+", "+new_task2+", "+new_task3+", "+today+", "+new_task4+", No")
            f.close()

        if option =="va":
            f = open("tasks.txt","r")
            print(f.read())
            f.close

        if option == "vm":
            num = username
            numLen = len(num)
            f = open("tasks.txt","r")
            words = (f.readline())
            sub_index = words.find(num)
            print(words[numLen:])
            
        if option =="e":
            logged_in = False
            close = True
