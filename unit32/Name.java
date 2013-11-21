/**
 * A name class
 * @author Ryan Closner
 * @version 11/21/2012
 **/

public class Name
{

    // Initialize the attributes

    String first  = "";
    String middle = "";
    String last   = "";

    /**
     * Name constructor
     * @param startFirst  the first name
     * @param startMiddle the middle name
     * @param startLast   the last name
     **/

    Name (String startFirst, char startMiddle, String stringLast)
    {
        first  = startFirst; 
        middle = startMiddle + ".";
        last   = stringLast;
    }

    /**
     * Name constructor
     * @param startFirst  the first name
     * @param startLast   the last name
     **/

    Name (String startFirst, String stringLast)
    {
        first = startFirst; 
        last  = stringLast;
    }

    /**
     * Returns the normal order of the name
     * @return the normal order of the name
     **/

    public String getNormalOrder ()
    {
        String str = "";
        str += first;
        if (middle != "") str += " " + middle;
        str += " " + last;
        return str;
    }

    /**
     * Returns the reverse order of the name
     * @return the reverse order of the name
     **/

    public String getReverseOrder ()
    {
        String str = "";
        str += last;
        str += ", " + first;
        if (middle != "") str += " " + middle;
        return str; 
    }

    /**
     * Returns the initials of the name
     * @return the initials of the name
     **/

    public String getInitials ()
    {
        String str = ""; 
        str += first.charAt(0);
        if (middle != "") str += middle.charAt(0);
        str += last.charAt(0);
        return str;
    }

}
