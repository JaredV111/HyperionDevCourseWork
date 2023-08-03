Price = input("how much is the price of the package: ")
Distance = input("enter the total distance of the delivery: ")
air = 0.38
freight = 0.25
full_insurance = 50
limited_insurance = 25
Gift = 15
no_Gift = 0
priority = 100
standard = 20
flo_price = float(Price) 
#if its Air 
q1 = input("air or freight: ")   
if q1 == 'air' or 'Air':
    Full_Distance = float(Distance) * air
#insurance 
q2 = input("full insurance or limited insurance: ")
if q2 == 'full insurance' or 'Full insurance':
     insurance = float(full_insurance)
     dis_insur = Full_Distance + insurance 
     
elif q2 == 'limited insurance' or 'Limited insurance':
    insurance = float(limited_insurance)
    dis_insur = Full_Distance + insurance 
    
#gift
q3 = input("gift or no gift: ")
if q3 == 'gift' or 'Gift':
    gift = float(Gift)
    gif_dis_insur = dis_insur + gift 
elif q3 == 'no gift' or 'No gift':
    gift = float(no_Gift)
    gif_dis_insur = dis_insur + gift 

#deliver
q4 = input("priority delivery or standard delivery: ")
if q4 == 'priority delivery' or 'Priority delivery':
    delivery = float(priority)
    final_price = gif_dis_insur + delivery + flo_price
    print(final_price)
elif q4 == 'standard delivery' or 'Standard delivery':
    delivery = float(standard)
    final_price = gif_dis_insur + delivery + flo_price
    print(final_price)

#If its Frieght 
else:
    q1 == 'freight' or 'Freight'
    Full_Distance = float(Distance) * freight
    
#insurance 
    q2 = input("full insurance or limited insurance: ")
if q2 == 'full insurance' or 'Full insurance':
     insurance = float(full_insurance)
     dis_insur = Full_Distance + insurance
     print(dis_insur)
elif q2 == 'limited insurance' or 'Limited insurance':
    insurance = float(limited_insurance)
    dis_insur = Full_Distance + insurance
    print(dis_insur)
#gift
    q3 = input("gift or no gift: ")
if q3 == 'gift' or 'Gift':
    gift = float(Gift)
    gif_dis_insur = dis_insur + gift
elif q3 == 'no gift' or 'No gift':
    gift = float(no_Gift)
    gif_dis_insur = dis_insur + gift
#delivery
    q4 = input("priority delivery or standard delivery: ")
if q4 == 'priority delivery' or 'Priority delivery':
    delivery = float(priority)
elif q4 == 'standard delivery' or 'Standard delivery':
    delivery = float(standard)


