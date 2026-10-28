def array_python
numbers = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

for row in range(len(numbers)):
    for column in range(len(numbers[row]) - 1, -1, -1):
        print(numbers[row][column])

