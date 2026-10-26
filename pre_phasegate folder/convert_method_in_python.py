
def convert_method_in_python(number):
    if number <= 1:
        return False

    for i in range(2, number):
        if number % i == 0:
            return False

    return True


number = int(input("Enter a number: "))
print(convert_method_in_python(number))




