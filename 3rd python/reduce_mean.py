
"""Using reduce(), find the maximum number in
[3, 5, 9, 2, 8]."""


from functools import reduce

numbers = [3, 5, 9, 2, 8]

result = reduce(lambda a, b: a if a > b else b, numbers)

print(result)


