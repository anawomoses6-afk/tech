
"""Filter all palindromes from ['level',
'world', 'madam', 'python']."""

words = ['level', 'world', 'madam', 'python']

result = list(filter(lambda word: word == word[::-1], words))

print(result)

