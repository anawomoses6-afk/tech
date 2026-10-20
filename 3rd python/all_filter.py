"""Use filter() to get all numbers from
range(1, 51) divisible by both 3 and 5.""""


numbers = range(1, 51)

result = list(filter(lambda number: number % 3 == 0 and number % 5 == 0, numbers))

print(result)


