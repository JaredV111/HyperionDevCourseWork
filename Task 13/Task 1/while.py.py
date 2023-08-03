anyNum = float(input("enter a number: "))
number = -1
counter = 0
answer = 0
while anyNum > number:
    counter += 1
    answer += anyNum
    anyNum = float(input("enter another number: "))
if (counter == 0): answer
else:
    print(answer/counter)
    
    

    
