"""Using map(), convert all strings in
['python', 'java', 'c++'] to uppercase"""


languages = ['python', 'java', 'c++']

result = list(map(str.upper, languages))

print(result)


