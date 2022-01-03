
package fruit;

/**
 * Class to drive/test the Fruit class.
 * Print a given Fruit with its description and verify if it is equal to another given fruit.
 * Assignment 1_A
 * Date : 2017-01-17
 * @author Jasen Ratnam
 */

public class Driver 
{

    /**
     * Method to drive/test the Fruit class.
     * Declare Fruit f1, print Fruit f1.
     * Declare Fruit f2, print Fruit f2.
     * Verify if f1 == f2, Print a message with the answer.
     * Use variable "x" as a third cup to hold calorie value of f1.
     * Swap calorie value of f1 with f2.
     * Swap calorie value of f2 with f1, using the third cup 'x'.
     * Print f1 with the new value of calories. 
     * Print f2 with the new value of calories. 
     * @param args Main method
     */
    public static void main(String[] args)                                       
    {
        Fruit f1 = new Fruit("Apple", "One medium apple with skin", 0.47, 95, 4.4); 
        System.out.println(f1);                                          
        
        Fruit f2 = new Fruit("Orange", "One medium orange", 1.23, 62, 3.1);     
        System.out.println(f2);                                       
       
        boolean result = f1.equals(f2);                                        
        System.out.printf("Fruits named %s and %s are%sthe same size\n\n",      
                           f1.getName(), f2.getName(), (result?" ":" not "));  
        
        
        double x = f1.getCalories();                                            
        f1.setCalories(f2.getCalories());                 
        f2.setCalories(x);
        
        System.out.println(f1);            
        System.out.println(f2);                                   
    }
}
