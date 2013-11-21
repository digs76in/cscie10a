/**
 * A piece of Pizza
 * @author Ryan Closner
 * @version 11/21/2012
 **/

import java.util.*;

public class Pizza
{

    // Define pizza attributes

    String name;
    double radius;
    double cost;
    int slices;

    /**
     * Pizza constructor
     * @param pName   the name of the pizza
     * @param pRadius the radius of the pizza
     * @param pCost   the cost of the pizza
     * @param pSlices the number of slices in the pizza
     **/

    Pizza (String pName, int pRadius, double pCost, int pSlices)
    {
        name = pName;
        radius = pRadius;
        cost = pCost;
        slices = pSlices;
    }

    /**
     * Getter for name
     * @return name
     **/

    public String getName ()
    {
        return name; 
    }

    /**
     * Calculates the area per slice
     * @return the area per slice
     **/

    public double areaPerSlice ()
    {
        return 1.0 / slices * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Calculates the cost per slice
     * @return the cost per slice
     **/

    public double costPerSlice ()
    {
        return cost / slices; 
    }

    /**
     * Calculates the cost per square inch
     * @return the cost per square inch
     **/

    public double costPerSquareInch ()
    {
        return costPerSlice() / areaPerSlice();
    }

}
