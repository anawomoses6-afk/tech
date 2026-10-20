
"""Using reduce(), find the sum of numbers from
1 to 50."""

from functools import reduce

numbers = range(1, 51)

result = reduce(lambda total, number: total + number, numbers)

print(result)


