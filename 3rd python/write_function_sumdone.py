"""Wite a function that sum all the element in the
corresponding index for each inner list. i.e all
the elements in index 0 summed up, the same
for index 1, down to the last index
Sample input : [ [2, 3, 4], [1, 5, 7], [4, 6, 8] ]
Sample ouput: [7, 14, 19]"""

def sum_function_sum(numbers):
    return [sum(inner_list[index] for inner_list in numbers)
            for index in range(len(numbers[0]))]


numbers = [[2, 3, 4], [1, 5, 7], [4, 6, 8]]

print(sum_function_sum(numbers))

