f = open ('DOB.txt','r+')
text_lines = f.readlines()
for line in text_lines:
    a = (line.split())
    names = (a[0:2])
    birthdates = (a[2:6])
    print('Name: ', *names)
    print('Birthdate: ' ,*birthdates)
    print("\n")
f.close()
    
    
