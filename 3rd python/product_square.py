
"""Using reduce() and map(), find the product
of the squares of numbers [1, 2, 3, 4]."""


from functools import reduce

numbers = [1, 2, 3, 4]

squares = map(lambda number: number ** 2, numbers)

result = reduce(lambda a, b: a * b, squares)

print(result)


