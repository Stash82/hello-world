# FizzBuzz in Python
#
# The classic interview problem:
#   - Print numbers 1 to 100
#   - But for multiples of 3, print "Fizz" instead
#   - For multiples of 5, print "Buzz" instead
#   - For multiples of both 3 and 5, print "FizzBuzz"
#
# Python notes:
#   - No class or main() required — just write code at the top level
#   - `range(1, 101)` generates numbers from 1 up to (but not including) 101
#   - Indentation defines code blocks (no curly braces needed)
#   - `print()` writes to standard output
#
# To run:
#   python3 fizzbuzz.py

for i in range(1, 101):
    # Check divisible by both 3 and 5 first — order matters here!
    if i % 15 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)
