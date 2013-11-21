/**
 * A class to test the name test
 * @author Ryan Closner
 * @version 11/21/2012
 **/

public class NameTest
{

    public static void main (String[] args)
    {
        // Instantiate two names with two different constructors

        Name teacher = new Name("Henry", 'H', "Leitner");
        Name tf = new Name("Jan", "Jackson");


        // Test each of the methods on the names

        System.out.println(teacher.getNormalOrder());
        System.out.println(tf.getNormalOrder());

        System.out.println(teacher.getReverseOrder());
        System.out.println(tf.getReverseOrder());

        System.out.println(teacher.getInitials());
        System.out.println(tf.getInitials());
    }

}
