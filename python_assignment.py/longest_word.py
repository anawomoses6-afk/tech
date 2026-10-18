
def strin_(my_string):
    
    return len(my_string)
sample_string = "semicolon"
print(string_length(sample_string))



def add_stringly(Str1):
    length = len(str1)
if length > 2:

    if str1[-3:] == 'ing':
        str1 += 'ly'
    else:
           str1 += 'ing'          
            return str1

print(add_string('xy'))
print(add_string('xyz'))
print(add_string('string'))


def find_longest_word(words):
    if not words:
        return None, 0  
        
    longest_word = max(words, key=len)
    return longest_word, len(longest_word)

word_list = ["apple", "banana", "cherry", "watermelon"]
word, length = find_longest_word(word_list)

print(f"Longest word: {word}")
print(f"Length: {length}")


def remove_odd_indices(text: str) -> str:
    return "".join([char for i, char in enumerate(text) if i % 2 == 0]) if text else ""

sample_data = "semicolon"
output = remove_odd_indices(sample_data)
print(f"Sample Output: {output}")



def find_minimum(numbers: list) -> int | float:
    return min(numbers) if numbers else None
sample_data = [8, 4, 9, 2, 5, 7, 3]
output = find_minimum(sample_data)
print(f"Expected Output: {output}")


def  find_maximum(numbers):
    if not numbers:
        return None
    return max(numbers)






