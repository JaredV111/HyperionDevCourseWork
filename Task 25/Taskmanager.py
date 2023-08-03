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


def add_task(username,title,desc,date):
    f = open("tasks.txt","a")
    f.write(username+", "+title+", "+desc+", "+today+", "+date+", No")
    f.close()

def reg_user(usname,password):
   with open("user.txt","r") as f:
       for line in f:
           if usname in line:
               return print("Username taken")
           else:
            f = open("user.txt","a")
            return f.write(" ,"+usname+" ,"+password)
            f.close()

def view_all():
    f = open("tasks.txt","r")
    print(f.read())
    f.close
    

def view_mine(name,number):
    f = open("tasks.txt","r")
    words = (f.readline())
    sub_index = words.find(name)
    print(words[number:])
    
        
while logged_in == False:
    in_user = input("Please enter the username: ")
    in_pass = input("Please enter a password: ")
    if in_user == username and in_pass == password:
        logged_in = True
    else:
        print("Error please try again")
            
while close == False:              
    while logged_in == True:
        option = input("Please select one of the following options:\n r - register user\n a - add task\n va - view all tasks\n vm - view my tasks\n gr - generate report\n e - exit\n")
        #option = option.lower
        if option == "r":
            newusr = input("Please enter new username: ")
            newpsswrd = input("Please enter new password: ")
            reg_user(newusr,newpsswrd)
        
        if option == "a":
            f = open("tasks.txt","a")
            new_task1 = input("Please enter enter the username of the person the task is assigned to: ")
            new_task2 = input("Please enter the title of the task: ")
            new_task3 = input("Please enter a description of the task:  ")
            new_task4 = input("Please enter the due date of the task: ")
            addtask(new_task1,new_task2,new_task3,new_task4)

        if option =="va":
            view_all()


        if option == "vm":
            num = username
            numLen = len(num)
            view_mine(num,numLen)

        if option =="gr":
            g =open("tasks.txt","a")
            count = 1
            while(g.readline()!=null):
                f = open("taskoverview.txt","w+")
                f.write("The number of tasks are:")
            
        if option =="e":
            logged_in = False
            close = True
