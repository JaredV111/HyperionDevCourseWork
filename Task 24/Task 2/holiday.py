#Total cost of a stay 
n = int(input("how many nights will you be staying: "))
def HotelCost(cost):
    cost_per_night = 200
    return  cost * cost_per_night
print(HotelCost(n))

citys = {'Cape Town':2500,
        'Durban':4500,
        'Johannesburg':2500,
        'Pretoria':3000
        }    
#The Plane cost
citycost = input("What city are you flying to: ")#what city are you going to.
def PlaneCost(city):
    if city in citys:
        print("your destination,",city)
        #all the different citys to travel to.
        if city == 'Cape Town':
            city = (citys['Cape Town'])
            print(city)
        elif city == 'Durban':
          city = (citys['Durban'])
          print(city)
        elif city == 'Johannesburg':
          city  = (citys['Johannesburg'])
          print(city)
        elif city == 'Pretoria':
          city = (citys['Pretoria'])
          print(city)
        return city

#if the city is in entered incorrectly
city = PlaneCost(citycost)
while city is None:
    print("Sorry, this isnt a valid command! ")
    citycost = input("What city are you flying to: ")
    city = PlaneCost(citycost)

price = int(input("How many days will you be renting the car: "))
def CarRental(x):
    cost_per_day = 400
    return x * cost_per_day
print(CarRental(price))



#HolidayCost
def HolidayCost(HotCost,PlanCost,CarCost):
    whole = HotCost + PlanCost + CarCost
    return whole

print("Your total is:")
print(HolidayCost(HotelCost(n),CarRental(price),city))
print("Have a great flight")
