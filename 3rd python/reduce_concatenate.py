
"""Using reduce(), concatenate all strings in
['I', 'love', 'Python'] into a single
string with spaces."""


from functools import reduce
words = ['I', 'love', 'Python']

result = reduce(lambda a, b: a + " " + b, words)

print(result)


