sen = input("Enter a sentence: ") 
re = input("enter letters you want to delete: ")
for letter in re:
    sen = sen.replace(letter,'')
print(sen)
