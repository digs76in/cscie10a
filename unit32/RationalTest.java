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

        // Test 3 cases

        System.out.println(a.lessThanRat(b));
        System.out.println(b.lessThanRat(a));
        System.out.println(a.lessThanRat(a));
    }
}
