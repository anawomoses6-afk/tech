"""Given a 2D list, write a function that sum up all
the element in each of the inner list and return a
single list. Sample input : [ [2, 3, 4], [1, 5, 7], [4, 6, 8] ]
Sample ouput: [9, 13, 18]"""


def sum_inner_lists(numbers):
    return [sum(inner_list) for inner_list in numbers]

numbers = [[2, 3, 4], [1, 5, 7], [4, 6, 8]]

print(sum_inner_lists(numbers))

