// FizzBuzz in Go
//
// The classic interview problem:
//   - Print numbers 1 to 100
//   - But for multiples of 3, print "Fizz" instead
//   - For multiples of 5, print "Buzz" instead
//   - For multiples of both 3 and 5, print "FizzBuzz"
//
// Go notes:
//   - Every Go file belongs to a package; `main` is the entry-point package
//   - Execution starts at the `main()` function
//   - `fmt.Println` prints a line to standard output (from the "fmt" package)
//   - Variable types are inferred with `:=` (short variable declaration)
//   - No parentheses around `if` or `for` conditions
//
// To run:
//   go run fizzbuzz.go

package main

import "fmt"

func main() {
	for i := 1; i <= 100; i++ {
		// Check divisible by both 3 and 5 first — order matters here!
		if i%15 == 0 {
			fmt.Println("FizzBuzz")
		} else if i%3 == 0 {
			fmt.Println("Fizz")
		} else if i%5 == 0 {
			fmt.Println("Buzz")
		} else {
			fmt.Println(i)
		}
	}
}
