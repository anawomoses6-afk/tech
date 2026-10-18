"""Write a program to unpack this tuple: (10, 20,
30, 40) into variables a, b, and the rest
in the last variable."""

numbers = (10, 20, 30, 40)

a = numbers[0]
b = numbers [1]
rest = list(numbers[2:])

print(a, b, rest)



