import random

print("Time to refresh my Python skills!")

print("\nThink of a random number between 1 and 10 and I will try to guess it!")

correctInput = input("Was I correct? (y/n): ")

while correctInput != "y":
    random_number = random.randint(1, 10)
    print("\nI guess the number is: {random_number}?")
    correctInput = input("Was I correct? (y/n): ")

