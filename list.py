
def string_length(input_string):
    return len(input_string)

sample_string = 'semicolon'
print(string_length(sample_string))

def get_string_parts(input_string):
    if len(input_string) < 2:
        return ""
    return input_string[:2] + input_string[-2:]

# Sample test cases:
print(get_string_parts('semicolon')) 
print(get_string_parts('on'))        
print(get_string_parts('o'))         


def add_ing_or_ly(input_string):
    if len(input_string) < 3:
        return input_string
    elif input_string.endswith('ing'):
        return input_string + 'ly'
    else:
        return input_string + 'ing'

# Sample test cases:
print(add_ing_or_ly('abc'))    
print(add_ing_or_ly('string')) 
print(add_ing_or_ly('on'))     



