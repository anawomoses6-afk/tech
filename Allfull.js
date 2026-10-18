import random

# 1. Create a list of 10 random numbers between 1 and 50
# We use random.randint(1, 50) inside a list comprehension to generate 10 numbers.
numbers = [random.randint(1, 50) for _ in range(10)]
print(f"Generated List: {numbers}")

print("-" * 40)



# 2. Get the length of a list without using the len() function
# We manually count each element in the list using a loop.
length_count = 0
for item in numbers:
    length_count += 1

print(f"Length of the list: {length_count}")



# 3. Sum up all the elements at even positions (indices 0, 2, 4, etc.)
# In programming, positions (indices) start at 0, so position 0 is the 1st element, 
# position 2 is the 3rd element, etc.
even_position_sum = 0
for i in range(0, length_count, 2):
    even_position_sum += numbers[i]

print(f"Sum of elements at even positions: {even_position_sum}")



# 4. Sum up all the elements at odd positions (indices 1, 3, 5, etc.)
odd_position_sum = 0
for i in range(1, length_count, 2):
    odd_position_sum += numbers[i]

print(f"Sum of elements at odd positions: {odd_position_sum}")



# 5. Multiply all elements at every third position (indices 2, 5, 8, etc.)
# Note: We start at index 2 (which is the 3rd element) and step by 3.
# We initialize the product to 1 because multiplying by 0 would ruin the math.
third_position_product = 1
has_third_elements = False  # To check if there are any elements at 3rd positions

for i in range(2, length_count, 3):
    third_position_product *= numbers[i]
    has_third_elements = True



if has_third_elements:
    print(f"Product of elements at every 3rd position: {third_position_product}")
else:
    print("No elements found at every 3rd position (list is too short).")



# 6. Calculate the average of all elements in the list
# Average = Total Sum of all elements / Total count of elements
total_sum = 0
for item in numbers:
    total_sum += item

average = total_sum / length_count
print(f"Average of all elements: {average}")
