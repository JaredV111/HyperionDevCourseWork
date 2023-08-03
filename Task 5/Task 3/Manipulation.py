# 
strManip = input("enter a sentence: ")
print(strManip)
strlength = len(strManip)
print(strlength)
lastletter = strManip[strlength-1]
print(lastletter)
strManip = strManip.replace(lastletter ,"@")
print(strManip)

#print last 3
secondlast = strManip[strlength-2]
thirdlast = strManip[strlength-3]
print(lastletter + secondlast + thirdlast)

#5 letter word
firstchar = strManip[0]
secondchar = strManip[1]
thirdchar = strManip[2]
newword = firstchar + secondchar + thirdchar + lastletter + secondlast
print(newword)

print("------------------------------------")

strManipList = strManip.split()

print(strManipList)

for word in strManipList:
    print(word)
