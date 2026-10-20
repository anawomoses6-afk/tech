"""Given a list of tuples [(1, 'A'), (4, 'B'),
(2, 'C')], use filter() to keep only tuples
where the first value is greater than 2."""

tuples = [(1, 'A'), (4, 'B'), (2, 'C')]

result = list(filter(lambda item: item[0] > 2, tuples))

print(result)



