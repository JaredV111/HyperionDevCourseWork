word = "the!quick!brown!fox!jumps!over!the!lazy!dog!"
word = word.replace("!", " ")
word = (word.upper())
word = ' '.join(reversed(word))
print(word)
