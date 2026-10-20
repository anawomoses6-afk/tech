"""
Given a list of tuples [(1, 2), (3, 4), (5,
6)], write a function that sum the elements of
each tuple, then use filter() to keep only
sums greater than 5."""


def sum_tuple(item):
    return sum(item)

tuples = [(1, 2), (3, 4), (5, 6)]

result = list(filter(lambda item: sum_tuple(item) > 5, tuples))

print(result)


