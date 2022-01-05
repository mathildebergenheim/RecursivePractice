import java.util.ArrayList;

public class Recursive {

    public static void main(String[] args) {

    }

    /*
    Given n of 1 or more, return the factorial of n, which
    is n * (n-1) * (n-2) ... 1.
    Compute the result recursively (without loops).
     */
    public int factorial(int n) {
        int i = 1;
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }


    /*
    We have a number of bunnies and each bunny has two big floppy ears.
    We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
     */

    public int bunnyEars(int bunnies) {
        if(bunnies == 0){
            return 0;
        }
        return 2 + bunnyEars(bunnies-1);
    }


    /*

    The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
    The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value
    is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the
    start of the sequence.
     */
    public int fibonacci(int n) {
        if (n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    /*
    We have bunnies standing in a line, numbered 1, 2, ...
    The odd bunnies (1, 3, ..) have the normal 2 ears.
    The even bunnies (2, 4, ..) we'll say have 3 ears, because they
    each have a raised foot. Recursively return the number of "ears" in
    the bunny line 1, 2, ... n (without loops or multiplication).
     */
    public int bunnyEars2(int bunnies) {
        int sum = 0;
        if( bunnies == 0){
            return 0;
        }
        else if (bunnies%2 == 0){
            sum += 3;
        }
        else {
            sum += 2;
        }

        return sum + bunnyEars2(bunnies -1);
    }


    /*
    We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
    the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number
    of blocks in such a triangle with the given number of rows.
    */


}


