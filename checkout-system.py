total_sum = 0
name = input("Enter Name: ")

while True:
    productName = input(name + " Enter Product Name: ")

    productQuantity = int(input("Enter Product Quantity: "))
    price = int(input("Enter Price Of " + productName + " : "))

    total_sum += price

    addAnotherProduct = input("Enter Another Product(YES/NO): ").lower()

    if addAnotherProduct != "yes":
        break

print(f"Your Total Bill Is: ${total_sum}")
