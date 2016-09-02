package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        // for now, return a random result
        if (n != 2 && n%2 == 0)
            return false;
        else if (n != 3 && n%3 ==0)
            return false;
        else if (n%4 == 0)
            return false;
        else if (n != 5 && n%5 == 0)
            return false;
        else if (n%6 == 0)
            return false;
        else if (n != 7 && n%7 == 0)
            return false;
        else if (n%8 == 0)
            return false;
        else if (n%9 == 0)
            return false;
        else if (n == 1)
            return false;
        else
            return true;
    }
}
