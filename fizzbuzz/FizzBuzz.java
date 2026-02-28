/**
 * FizzBuzz in Java
 *
 * The classic interview problem:
 *   - Print numbers 1 to 100
 *   - But for multiples of 3, print "Fizz" instead
 *   - For multiples of 5, print "Buzz" instead
 *   - For multiples of both 3 and 5, print "FizzBuzz"
 *
 * Java notes:
 *   - Every program needs a class matching the filename
 *   - Execution starts at the `main` method
 *   - `System.out.println` prints a line to standard output
 *   - `%` is the modulo (remainder) operator
 *
 * To compile and run:
 *   javac FizzBuzz.java
 *   java FizzBuzz
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Check divisible by both 3 and 5 first — order matters here!
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
