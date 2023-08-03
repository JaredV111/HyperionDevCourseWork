year = int(input("enter a year: "))
num_years = int(input("enterow many years you want to check: "))
last_year = year + num_years
list(range(year + (4 - year %4), last_year + 1, 4))
for year in range(year, last_year):
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                print("{} is a leap year".format(year))
            else:
                print("{} is not a leap year".format(year))
        else:
            print ("{} is a leap year".format(year))
    else:
        print("{} is not a leap year".format(year))
        year += 1 

    
