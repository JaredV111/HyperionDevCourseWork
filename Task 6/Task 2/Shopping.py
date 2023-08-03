product1 = input("name a product: ")
print(product1)

product2 = input("name a product: ")
print(product2)

product3 = input("name a product: ")
print(product3)

#price of product 1 
price_of_product1 = input("price: ")
price_of_product1_flo = float(price_of_product1)
print("%.2f" % price_of_product1_flo)

#price of product 2
price_of_product2 = input("price: ")
price_of_product2_flo = float(price_of_product2)
print("%.2f" % price_of_product2_flo)

#price of product 3 
price_of_product3 = input("price: ")
price_of_product3_flo = float(price_of_product3)
print("%.2f" % price_of_product3_flo)

#sum of the products
price_of_product1_int = int(price_of_product1_flo)
price_of_product2_int = int(price_of_product2_flo)
price_of_product3_int = int(price_of_product3_flo)

sum1 = price_of_product1_int + price_of_product2_int + price_of_product3_int
print(sum1)

#mean of the products

mean1 = sum1 / 3
print(mean1)


print("The total of {},{},{}, is R {} and the average price of the items are R {}.".format(price_of_product1_flo, price_of_product2_flo, price_of_product3_flo, sum1, mean1))
    
