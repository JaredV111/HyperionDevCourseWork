def weekdays(day):
    days = ['Monday','Tuesday','Wednesday','Thursday', 'Friday', 'Saturday', 'Sunday']
    i = days.index(day)
    d1 = days[i:]
    d1.extend(days[:i])
    return d1
#printing out all the days of the week
def test_weekdays():
    days = ['Monday','Tuesday','Wednesday','Thursday', 'Friday', 'Saturday', 'Sunday']
    for day in days:
        print(weekdays(day))
#replacing every 2nd word with hello
def replace(sentence):

    I = sentence.split(' ')

    list_odd = I[0::2]
    print(list_odd)
    final_list = []

    for word in list_odd:
        final_list.append(word)
        final_list.append('hello')

    final_string = " ".join(final_list)

    print(final_string)
replace("I want to replace every other word in this string with hello" )
