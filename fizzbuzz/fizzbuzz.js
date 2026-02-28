// FizzBuzz in JavaScript
//
// The classic interview problem:
//   - Print numbers 1 to 100
//   - But for multiples of 3, print "Fizz" instead
//   - For multiples of 5, print "Buzz" instead
//   - For multiples of both 3 and 5, print "FizzBuzz"
//
// JavaScript notes:
//   - Can run in a browser console or with Node.js on the command line
//   - `let` declares a block-scoped variable (prefer over the older `var`)
//   - `===` is strict equality — always use this over `==` in JS
//   - `console.log()` prints to standard output / browser console
//
// To run with Node.js:
//   node fizzbuzz.js

for (let i = 1; i <= 100; i++) {
    // Check divisible by both 3 and 5 first — order matters here!
    if (i % 15 === 0) {
        console.log("FizzBuzz");
    } else if (i % 3 === 0) {
        console.log("Fizz");
    } else if (i % 5 === 0) {
        console.log("Buzz");
    } else {
        console.log(i);
    }
}
