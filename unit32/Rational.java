/**
 * A piece of Pizza
 * @author Ryan Closner
 * @author Jan Jackson (or Dr. Henry Leitner)
 * @version 11/21/2012
 **/

class Rational
{
	// first define the instance variables
	private int numerator;
	private int denominator;

	// 3 constructors
	public Rational (int n, int d)
	{
		int a = n;
		int b = d;

		//implement Euclid's algorithm here

		int remainder = a % b;

		while (remainder != 0) {
			a = b;
			b = remainder;
			remainder = a % b;
		}

		numerator = n / b;
		denominator = d / b;
	}

	/**
	* Determines whether rational is less than another
	* @param r another rational
	* @return  whether the rational is less than the instance
	**/

	public boolean lessThanRat(Rational r)
	{
		return ((numerator * 1.0) / (denominator * 1.0)) < ((r.numerator * 1.0) / (r.denominator * 1.0));
	}

	public String toString()
	{
		return ""  + numerator + "/" + denominator;
	}

}
