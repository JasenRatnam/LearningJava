package fruit;

/**
 * Print a given Fruit with its description and verify if it is equal to another given fruit.
 * Assignment 1_A
 * Date : 2017-01-17
 * @author Jasen Ratnam
 */

public class Fruit
{
    /**
     * Variable String used in entire class for the name of a given Fruit.
     */
    public String Name;                                                          

    /**
     * Variable String used in entire class for the portion size of a given Fruit.
     */
    public String PortionSize;                                           

    /**
     * Variable double used in entire class for the protein value of a given Fruit.
     */
    public double protein;                                              

    /**
     * Variable double used in entire class for the calorie value of a given Fruit.
     */
    public double calories;                                                      

    /**
     * Variable double used in entire class for the fiber value of a given Fruit.
     */
    public double fibers;                                                        
    
    /**
     * Constructor method; Save the given name, portion size, calorie, protein and fibers into the instance variables.
     * @param N  given Name of the Fruit.
     * @param Ps given Portion Size of the Fruit.
     * @param p  given Protein of the Fruit.
     * @param c  given Calorie of the Fruit.
     * @param f  given Fiber of the Fruit.
     */
    public Fruit(String N, String Ps, double p, double c, double f)              
    {
        this.Name = N;                                                           
        this.PortionSize = Ps;                                                   
        this.calories = c;                                                        
        this.fibers = f;                                                        
        this.protein = p;                                                        
    }
    
    /**
     * Find the name of a given Fruit and return it.
     * @return the name. 
     */
    public String getName()                                                      
    {
        String name = this.Name;                                  
        return name;                                    
    }
    
    /**
     * Method to get the portion size of a given fruit and return it.
     * @return the portion size.
     */
    public String getPortionSize()                                               
    {
        String PortionSize = this.PortionSize;
        return PortionSize;                                        
    }
    
    /**
     * Method to get the protein value of a given fruit and return it.
     * @return the protein value.
     */
    public double getProtein()                                
    {
        double protein = this.protein;
        return protein;                                        
    }
    
    /**
     * Method to get the calorie value of a given fruit and return it.
     * @return the calorie value.
     */
    public double getCalories()                                               
    {
        double calories = this.calories;
        return calories;                                                 
    }

    /**
     * Method to get the fiber value of a given fruit and return it.
     * @return the fiber value.
     */
    public double getFibers()                                        
    {
        double fibers = this.fibers;
        return fibers;                                
    }
    
    /**
     * Method to set the name of a fruit to a different one.
     * @param name The given name to be set.
     */
    public void setName(String name)                                
    {
        this.Name = name;                    
    }
    
    /**
     * Method to set the portion size of a fruit to a different one.
     * @param portionSize the given portion size to be set.
     */
    public void setPortionSize(String portionSize)                              
    {
        this.PortionSize = portionSize;                                          
    }
    
    /**
     * Method to set the protein value of a fruit to a different one.
     * @param protein the given protein value to be set.
     */
    public void setProtein(double protein)                                       
    {
        this.protein = protein;                                                 
    }
    
    /**
     * Method to set the calorie value of a fruit to a different one.
     * @param calories the given calorie value to be set.
     */
    public void setCalories(double calories )            
    {
        this.calories = calories;                                               
    }
    
    /**
     * Method to set the fiber value of a fruit to a different one.
     * @param fibers the given fiber value to be set.
     */
    public void setFibers(double fibers)                                       
    {
        this.fibers = fibers;                                           
    }
    
    /**
     * Method to verify if fruit f1 is same to fruit f2.
     * f1 is the same as f2 if the calorie, fiber and protein value are the same.
     * @param f1 fruit to be compared
     * @return true if they are the same, false if not.
     */
    public boolean equals(Fruit f1)                                           
    {   
        if (this.calories == f1.calories && this.fibers == f1.fibers && this.protein == f1.protein)
        {
            return true;                                                        
        }
        else
        {
            return false;                                                        
        }
    }
   
    public String toString()                                                    
    {
        String display = "Fruit name   : " + Name + "\n" +                    
                         "Portion size : " + PortionSize + "\n" +                 
                         "Protein      : " + protein + " grams\n" +              
                         "calories     : " + calories + "\n" +                   
                         "fiber        : " + fibers + " grams\n";             
        return display;                                                         
    }
    
    /**
     * Main method to test the class.
     * Returns a message telling method is working.
     * @param args Main method.
     */
    public static void main(String[] args)                                       
    {
        System.out.println("Test driver in Fruit - doing nothing");
    }
     
    /**
     * Default constructor for the FruitList class.
     * @param f the given fruit.
     */
    public Fruit(Fruit f)               
     {
         this(f.Name, f.PortionSize, f.protein, f.calories, f.fibers);
     }   
}
