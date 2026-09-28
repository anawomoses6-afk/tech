text = "motivated for action"                               

result = ""

for letter in text:
    if "a" <= letter <= "z":
        result += chr(ord(letter) - 32)
    else:
        result += letter

print(result)
