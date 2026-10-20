"""Write a function that extract only words longer
than 5 characters from ['cat', 'elephant', 'tiger', 'lion']"""


def long_words(words):
    return list(filter(lambda word: len(word) > 5, words))

animals = ['cat', 'elephant', 'tiger', 'lion']

result = long_words(animals)

print(result)



