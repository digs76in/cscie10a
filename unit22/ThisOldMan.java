/**
 * Prints the verses to the song 'This Old Man'
 * @author Ryan Closner
 * @version 10/18/2012
 **/

class ThisOldMan
{

    // How many verses are there?

    private final static int VERSES = 9;

    public static void main(String [] args)
    {
        // Print each verse

        for (int i = 0; i < VERSES; i++) {
            String object = determineObject(i);
            String verse = getVerse(i + 1, object);
            System.out.println(verse);
        }
    }

    /**
     * Returns the verse for a given index and object
     * @param played the number of times he played
     * @param object the object upon which he played
     * @return       the verse
     **/
    static String getVerse(int played, String object)
    {
        String verse;

        verse =  "This old man, he played " + played + ".\n";
        verse += "He played nick-nack " + object + ";\n";
        verse += "With a nick-nack paddy-whack, give the dog a bone,\n";
        verse += "This old man came running home.\n";

        return verse;
    }

    /**
     * @param     verse                    the number of the verse
     * @exception IllegalArgumentException if the verse number is greater than (VERSES) 
     * @return                             the object for the given verse number
     **/
    static String determineObject (int verse)
    {
        // Return the object for the given verse

        if (verse == 0) {
            return "on my drum";
        } else if (verse == 1) {
            return "on my shoe";
        } else if (verse == 2) {
            return "on my tree";
        } else if (verse == 3) {
            return "on my door";
        } else if (verse == 4) {
            return "on my hive";
        } else if (verse == 5) {
            return "on my sticks";
        } else if (verse == 6) {
            return "up in heaven";
        } else if (verse == 7) {
            return "on my gate";
        } else if (verse == 8) {
            return "on my spine";
        } else if (verse == 9) {
            return "on my hen";
        } else {
            throw new IllegalArgumentException("verse number must be within the range 0-9");
        }
    }

}
