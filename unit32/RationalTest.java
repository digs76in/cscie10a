/**
 * A test class for the Rational#lessThanRat method
 * @author Ryan Closner
 * @version 11/21/2012
 **/

public class RationalTest
{
    public static void main (String [] args)
    {
        // Instantiate two rationals

        Rational a = new Rational( 8, 16 );
        Rational b = new Rational( 2, 3 );

        // Test 4 cases

        printTest(a,b);
        printTest(b,a);
        printTest(a,a);
        printTest(b,b);
    }

    private static void printTest (Rational a, Rational b)
    {
      System.out.println( a.toString() + " < " + b.toString() + " is " + a.lessThanRat(b) );
    }

}
