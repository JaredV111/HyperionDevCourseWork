ofile = open('Regform','w')
register = int(input("how many students are you registering: " ))
ofile.write(str(register))
for register in range(0,register):
    ID = input("Enter the students ID number: ")
    ofile.write(ID +"\n")
ofile.close()
           
