"""Given a 2D list, write a function that sum up all
the element in each of the inner list and return a
single list.
Sample input : [ [2, 3, 4], [1, 5, 7], [4, 6, 8] ]
Sample ouput: [9, 13, 18]"""

def given_sum_list (numbers)

    numbers = [ [2, 3, 4], [1, 5, 7], [4, 6, 8] ]
        result = []

        for index in range(len(numbers)):
        total = 0
            
            for count in range(len(index):  
                total = total + numbers[count][index]
                
            result.appen(total)
        return result

print(given_sum_list(number))

