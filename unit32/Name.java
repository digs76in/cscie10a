/**
 * A name class
 * @author Ryan Closner
 * @version 11/21/2012
 **/

public class Name
{

    // Initialize the attributes

    String first  = null;
    String middle = null;
    String last   = null;

    /**
     * Name constructor
     * @param startFirst  the first name
     * @param startMiddle the middle name
     * @param startLast   the last name
     **/

    Name (String startFirst, char startMiddle, String stringLast)
    {
        first  = startFirst; 
        middle = Character.toString(startMiddle);
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
        return join( " ", first, joinIf( middle != null, "", middle, "." ), last );
    }

    /**
     * Returns the reverse order of the name
     * @return the reverse order of the name
     **/

    public String getReverseOrder ()
    {
        return join( " ", join("", last, ","), first, joinIf(middle != null, "", middle, ".") );
    }

    /**
     * Returns the initials of the name
     * @return the initials of the name
     **/

    public String getInitials ()
    {
        return join( "", first.charAt(0), middle, last.charAt(0) );
    }

    /**
     * Delegates to join if the condition is true, else returns null
     * @param condition a truthy/falsy value
     * @param seperator see #join
     * @param items     see #join
     * @return          a null or a String
     **/

    private String joinIf(boolean condition, Object seperator, Object... items)
    {
        return condition? join(seperator, items) : null;
    }

    /**
     * Concatenates a list of arguments into a String
     * @param seperator the item to insert between args
     * @param items     items to concatenate
     * @return the joined String
     **/

    private String join (Object seperator, Object... items)
    {
        String str = ""; 
        Object item;
        for (int i = 0; i < items.length; i++) {
            item = items[i];
            if (item != null) {
                if (i != 0) str += seperator;
                str += item;
            }
        }
        return str;
    }

}
