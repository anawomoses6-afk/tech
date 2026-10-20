
"""Use map() to square all numbers from 1 to 10"""

numbers = range(1, 11)

result = list(map(lambda number: number ** 2, numbers))

print(result)

