def sen(s):
    ret = ""
    i = True
    for char in s:
        if i:
            ret += char.upper()
        else:
            ret += char.lower()
        if char != ' ':
            i = not i
    return ret

