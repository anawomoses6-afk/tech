"""16. Find the sum of all elements in an array"""

numbers = [10, 20, 30, 40, 50, 60]
sum = 0

for count in range(len(numbers)):
    sum = sum + numbers[count]

    print(sum)

