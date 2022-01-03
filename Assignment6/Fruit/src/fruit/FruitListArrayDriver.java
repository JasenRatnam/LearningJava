package fruit;

import java.io.FileNotFoundException;

/**
 * Class to drive/test the FruitListArray class.
 * Read a file and find the listed fruits, and their description, and save them in a ArrayList, and display them.
 * Use he class ArrayList in the place of the array.
 * Find the maximum protein, calorie and fiber.
 * Find if x fruitListArray is equal to y fruitListArray.
 * Assignment 1_C
 * Date : 2017-02-20
 * @author Jasen Ratnam
 */
public class FruitListArrayDriver 
{
    /**
     * Method to test/drive the fruitListArray class.
     * Using the ArrayList class in the place of the array.
     * Test the constructors.
     * Test the toString methods.
     * Test the  addToFront method.
     * Test the  addToFront method on a full list array, using isFull method.
     * Test all minimum and maximum methods.
     * Test the default copy constructor.
     * Test the equals methods.
     * @param args Unused.
     * @throws FileNotFoundException File reading method
     */
     public static void main(String[]args) throws FileNotFoundException                           
    {
        FruitListArray fruitBasket = new FruitListArray ();
        fruitBasket.load("FruitDtabase.txt"); 
        
        System.out.println();
        System.out.println(fruitBasket);
        
        fruitBasket.addToFront(new Fruit("Blueberries", "One cup of blueberries", 1.1, 84, 3.6));
        fruitBasket.addToFront(new Fruit("Lychees", "One cup of fresh lychees", 1.58, 125, 2.5));
        System.out.println(fruitBasket);
        
        fruitBasket.addToFront(new Fruit("Lime", "One lime", 0.47, 20, 1.9));
        
        System.out.println("\nFruit with minimum Protein: \n"
                         + "----------------------------- \n"
                         + fruitBasket.minProtein());
        
        System.out.println("\nFruit with maximum Protein: \n"
                         + "----------------------------- \n"
                         + fruitBasket.maxProtein());
        
        System.out.println("\nFruit with minimum Calorie: \n"
                         + "----------------------------- \n"
                         + fruitBasket.minCalorie());
        
        System.out.println("\nFruit with maximum Calorie: \n"
                         + "----------------------------- \n"
                         + fruitBasket.maxCalorie());
        
        System.out.println("\nFruit with minimum Fiber: \n"
                         + "----------------------------- \n"
                         + fruitBasket.minFiber());
        
        System.out.println("\nFruit with maximum Fiber: \n"
                         + "----------------------------- \n"
                         + fruitBasket.maxFiber());
        
        System.out.println();
        FruitListArray fruitBowl = new FruitListArray();
        fruitBowl.load("FruitDtabase.txt");
        System.out.println();
        System.out.println(fruitBowl);
        System.out.println();
        if(fruitBowl.equals(fruitBasket))
            System.out.println("fruit bowl and fruit basket are equal");
        else
            System.out.println("fruit bowl and fruit basket are NOT equal"); 
    }
    
}
