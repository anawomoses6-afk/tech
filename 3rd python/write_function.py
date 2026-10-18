""" 5. Write a function that extract only words longer
than 5 characters from ['cat',
'elephant', 'tiger', 'lion']."""

def extract_long_words(words):
words = ['cat', 'elephant', 'tiger', 'lion']
    result = []

    for word in words:
        if len(word) > 5:
            result.append(word)

    return result

print(extract_long_words(words))


    
    
    
    
