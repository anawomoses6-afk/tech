
"""Given prices = [100, 200, 300], use
map() to add 10% tax to each price."""

prices = [100, 200, 300]

result = list(map(lambda price: price * 1.10, prices))

print(result)

