sum_total = 0
name = input("Enter Name: ")

while True:
    product_name = input("Enter Product Name: ")
    quantity_product = int(input("Enter Quantity_product: "))
    product_price = int(input("Enter price of " + " product-name "))
    sum_total =  product_price + sum_total  
    add_more_product = input("Enter More Product(Yes/No): ") .lower()
    if add_more_product != "YES":
        break
