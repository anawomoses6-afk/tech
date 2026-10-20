
"""Given data = ['123', '456', '789',
'abc', 'def'], write a function that remove
non-numeric strings, then convert them into
integers, then find and return their total sum."""


def total_sum(data):
    numeric_strings = filter(str.isdigit, data)
    numbers = map(int, numeric_strings)
    return sum(numbers)

data = ['123', '456', '789', 'abc', 'def']

result = total_sum(data)

print(result)


