card_num_str = input("Hello, Kindly Enter Card details to verify: ")
card_num_str = card_num_str.strip()

reversed_num = ""
last_index = len(card_num_str) - 1

for i in range(last_index, -1, -1):
    reversed_num = reversed_num + card_num_str[i]

first_char  = card_num_str[0]
second_char = card_num_str[1]

card_type = "Invalid Card"
if first_char == "4":
    card_type = "Visa"
elif first_char == "5":
    card_type = "MasterCard"
elif first_char == "3" and second_char == "7":
    card_type = "American Express"
elif first_char == "6":
    card_type = "Discover"

total_sum = 0

for index in range(len(reversed_num)):
    char = reversed_num[index]
    digit = int(char)

    if index % 2 != 0:
        doubled = digit * 2
        if doubled > 9:
            doubled = doubled - 9
        total_sum = total_sum + doubled
    else:
        total_sum = total_sum + digit

if total_sum % 10 == 0:
    status = "Valid"
else:
    status = "Invalid"

print("*" * 40)
print("**Credit Card Type:", card_type)
print("**Credit Card Number:", card_num_str)
print("**Credit Card Digit Length:", len(card_num_str))
print("**Credit Card Validity Status:", status)
print("*" * 40)
