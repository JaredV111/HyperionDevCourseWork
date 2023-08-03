#Empty list to enter your 3 friends name.
friends_list = ['','','']

friends_list[0] = input("Enter the first name of your friend: ")

friends_list[1] = input("Enter the second name of your friend: ")

friends_list[2] = input("Enter the third name of your friend: ")
#printing out the names of your friends .

first_name = friends_list[0:1]

third_name = friends_list[2:3]

print(*first_name)

print(*third_name)

print(len(friends_list))
#friends ages 
friend_ages = ['','','']

friend_ages[0] = input("Enter the age of your first friend: ")
friend_ages[1] = input("Enter the age of your second friend: ")
friend_ages[2] = input("Enter the age of your third friend: ")

#Corresponding lists
friend_list_to_ages = {friends_list[x]:friend_ages[x]for x in range(len(friends_list))}
for x in friend_list_to_ages:
    print(x,friend_list_to_ages[x])
    
