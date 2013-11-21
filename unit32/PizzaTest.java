/**
 * Tests the Pizza class
 * @author Ryan Closner
 * @version 11/21/2012
 **/

public class PizzaTest
{
    /**
     * Instantiates two pizzas and prints their stats
     * @param args the args
     **/

    public static void main (String [] args)
    {
        Pizza pizza1 = new Pizza("Pepperoni", 8, 10.50, 10);
        printPizzaStats(pizza1);

        Pizza pizza2 = new Pizza("Pineapple & Pepper", 10, 11.95, 8);
        printPizzaStats(pizza2);

    }

    /**
     * Prints stats for a pizza
     * @param pizza the pizza for which to print stats
     **/

    private static void printPizzaStats (Pizza pizza)
    {
        System.out.printf( "Your %s pizza has %.2f square inches per slice.\n",
                pizza.getName(), pizza.areaPerSlice() );
        System.out.printf ("One slice costs $%.2f, which comes to $%.3f per square inch.\n", 
                pizza.costPerSlice(), pizza.costPerSquareInch() );

    }
}
