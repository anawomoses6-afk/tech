"""Wite a function that sum all the element in the
corresponding index for each inner list. i.e all
the elements in index 0 summed up, the same
for index 1, down to the last index
Sample input : [ [2, 3, 4], [1, 5, 7], [4, 6, 8] ]
Sample ouput: [7, 14, 19]"""

def inner_list_numbers(numbers):
    result = []

    for counter in range(len(numbers)):
        total = 0

        for index in range(len(numbers[counter])):
            total = total + numbers[counter][index]

        result.append(total)

    return result


numbers = [[2, 3, 4], [1, 5, 7], [4, 6, 8]]

print(inner_list_numbers(numbers))


