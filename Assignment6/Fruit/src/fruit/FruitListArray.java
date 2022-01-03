package fruit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

        
/**
 * Read a file and find the listed fruits, and their description, and save them in a ArrayList, and display them.
 * Use he class ArrayList in the place of the array.
 * Find the maximum protein, calorie and fiber.
 * Find if x fruitListArray is equal to y fruitListArray.
 * Assignment 1_C
 * Date : 2017-02-20
 * @author Jasen Ratnam
 */
public class FruitListArray 
{
  private ArrayList<Fruit> fruitlist; 
  
   /**
     * Initializes a newly created FruitListArray object.
     * Constructor to create a Fruit array of size infinity.
     */
  public FruitListArray()
  {
      fruitlist = new ArrayList<Fruit>();
  }
  
  public int size()
  {
      return fruitlist.size();
  }
  
//  /**
//     * Initializes a newly created FruitListArray object of default size.
//     * Constructor to create a Fruit array of default size.
//     * Default size = 10 as previously shown.
//     * Do same thing as other constructor with cap = to DEFAULT_SIZE.
//     */
//  public FruitListArray()
//  {
//       this(DEFAULT_SIZE);
//  }
//  
//  /**
//     * Find the total size of the ArrayList given.
//     * @return the size of the array.
//     */
//  public int capacity()
//  {
//    return fruitlist.length;
//  }
//  
//  /**
//     * Finds if the array is full.
//     * Method capacity used to find the size of the array. 
//     * @return True if fruitCount is equal to the size of the array.
//     * Using .size() method from ArrayList
//     * 
//     */
//  public boolean isFull()
//  {
//      return fruitlist.size() == capacity();
//  }
  
  /**
     * Add a fruit to the front of a fruitListArray.
     * If the list is full, a error message will be shown and method returned, the isFull method used here.
     * A loop is created to make all the fruits move by one in the fruitListArray.
     * Loop ends when the fruitCount is equal to 0.
     * Add given fruit f to fruitCount 0 'position' in fruitList and 1 to fruitCount.
     * @param f The Fruit given to be added at the front of a fruitList.
     */
  public void addToFront(Fruit f)
{
    int position = 0;
//    if (isFull())
//    {
//        System.out.println("List overflow - Request rejected");
//        return;
//    }
    fruitlist.add(position, f);
}
  
   /**
     * Method to load the given file, with the fruitListArray.
     * If the file does not exist return an error message and exit.
     * Else create a Scanner named fileScan which scans the file given by the user.
     * Read files and save Name, portionSize, protein, calories and fibers.
     * Create a fruit with found info and add to the end of the frutiListArray using add() method of ArrayList.
     * @param fileName is the name of the file with the fruitListArray given by the user.
     * @throws FileNotFoundException File reading.
     * 
     */
  public void load(String fileName) throws FileNotFoundException
  {
      File file = new File (fileName);
      if(!file.exists())
      {
          System.out.println("Could not find file");
          System.exit(1);
      }
      else
      {
          Scanner fileScan = new Scanner(file);
          while(fileScan.hasNext())
          {  
              String name = fileScan.nextLine();
              String portionSize = fileScan.nextLine();
              double protein = fileScan.nextDouble();
              double calories = fileScan.nextDouble();
              double fibers = fileScan.nextDouble();
              fileScan.nextLine();  // read and discard
 
              Fruit f = new Fruit (name, portionSize,protein, calories, fibers);
              
              fruitlist.add(f);
        
             
          }
      }
          System.out.println("Sucessfully opened input file named" + fileName);
          System.out.println("Fruit records processed: " + fruitlist.size());
          System.out.println("Fruit list size: " + fruitlist.size()); //+ " Capacity: " + capacity());
  }
  
  /**
     * Find the Fruit with maximum amount of calorie.
     * Assume that the first fruit as the maximum amount calories.
     * Does a loop to find if any other Fruit as a higher calorie value.
     * If found make that the maxPos. Using ArrayList.
     * @return the Fruit with the maximum Calorie value.
     */
    public Fruit maxCalorie()
    {
        int maxPos = 0;
        for(int x = 0; x < fruitlist.size(); x++)
        {
            if( fruitlist.get(x).getCalories() > fruitlist.get(maxPos).getCalories())
                {
                    maxPos = x;
                }
        } 
        return fruitlist.get(maxPos);
    }
    
    /**
     * Find the Fruit with minimum amount of calorie.
     * Assume that the first fruit as the minimum amount calories.
     * Does a loop to find if any other Fruit as a lower calorie value.
     * If found make that the minPos. Using ArrayList.
     * @return the Fruit with the minimum Calorie value.
     */
    public Fruit minCalorie()
    {
        int minPos = 0;
        for(int x = 0; x < fruitlist.size(); x++)
        {
            if( fruitlist.get(x).getCalories() < fruitlist.get(minPos).getCalories())
                {
                    minPos = x;
                }
        } 
        return fruitlist.get(minPos);
    }
     
    /**
     * Find the Fruit with maximum amount of Protein.
     * Assume that the first fruit as the maximum amount Protein.
     * Does a loop to find if any other Fruit as a higher Protein value.
     * If found make that the maxPos. Using ArrayList.
     * @return the Fruit with the maximum Protein value.
     */
    public Fruit maxProtein()
    {
        int maxPos = 0;
        for(int x = 0; x < fruitlist.size(); x++)
        {
            if( fruitlist.get(x).getProtein() > fruitlist.get(maxPos).getProtein())
                {
                    maxPos = x;
                }
        } 
        return fruitlist.get(maxPos);
    }
    
    /**
     * Find the Fruit with minimum amount of Protein.
     * Assume that the first fruit as the minimum amount Protein.
     * Does a loop to find if any other Fruit as a lower Protein value.
     * If found make that the minPos. Using ArrayList.
     * @return  the Fruit with the minimum Protein value.
     */
    public Fruit minProtein()
    {
        int minPos = 0;
        for(int x = 0; x < fruitlist.size(); x++)
        {
            if( fruitlist.get(x).getProtein() < fruitlist.get(minPos).getProtein())
                {
                    minPos = x;
                }
        } 
        return fruitlist.get(minPos);
    }
    
    /**
     * Find the Fruit with maximum amount of Fiber.
     * Assume that the first fruit as the maximum amount Fiber.
     * Does a loop to find if any other Fruit as a higher Fiber value.
     * If found make that the maxPos. Using ArrayList.
     * @return the Fruit with the maximum Fiber value.
     */
    public Fruit maxFiber()
    {
        int maxPos = 0;
        for(int x = 0; x < fruitlist.size(); x++)
        {
            if( fruitlist.get(x).getFibers() > fruitlist.get(maxPos).getFibers())
                {
                    maxPos = x;
                }
        } 
        return fruitlist.get(maxPos);
    }
    
    /**
     * Find the Fruit with minimum amount of Fiber.
     * Assume that the first fruit as the minimum amount Fiber.
     * Does a loop to find if any other Fruit as a lower Fiber value.
     * If found make that the minPos. Using ArrayList.
     * @return the Fruit with the minimum Fiber value.
     */
    public Fruit minFiber()
    {
        int minPos = 0;
        for(int x = 0; x < fruitlist.size(); x++)
        {
            if( fruitlist.get(x).getFibers() < fruitlist.get(minPos).getFibers())
                {
                    minPos = x;
                }
        } 
        return fruitlist.get(minPos);
    }
  
  /**
     * Find the total protein level of all fruits from the list combined.
     * Add the protein value of each fruit to 'totalP' using the getProtein method. Using ArrayList.
     * @return value of totalProtein
     */
  public double totalProtein()
    {
        double totalP = 0;
        for(int x = 0; x < fruitlist.size(); x++)
        {
            totalP += fruitlist.get(x).getProtein();     
        } 
        return totalP;
    }
    
    /**
     * Find the total calorie level of all fruits from the list combined.
     * Add the calorie value of each fruit to 'totalC' using the getCalories method. Using ArrayList.
     * @return value of totalCalories
     */
    public double totalCalorie()
    {
        double totalC = 0;
        for(int x = 0; x < fruitlist.size(); x++)
        {
            totalC += fruitlist.get(x).getCalories();     
        } 
        return totalC;
    }
    
    /**
     * Find the total fiber level of all fruits from the list combined.
     * Add the fiber value of each fruit to 'totalF' using the getFibers method. Using ArrayList.
     * @return value of totalFibers
     */
    public double totalFiber()
    {
        double totalF = 0;
        for(int x = 0; x < fruitlist.size(); x++)
        {
            totalF += fruitlist.get(x).getFibers();     
        } 
        return totalF;
    }
  
  @Override
    public String toString()
    { 
         String displayInfo = String.format("%1$12s %2$7s %3$7s%4$7s  %5$7s", "Name", "Protein", "Calories", "Fiber", "Portion size") ;
         displayInfo += "\n";
         displayInfo += String.format("%1$12s %2$7s %3$7s%4$7s  %5$7s"," ====", "=======", "========", "=====", "============") ;
         displayInfo += "\n";

        for(int x = 0; x < fruitlist.size(); x++)
        {
            String name = fruitlist.get(x).getName();
            double protein = fruitlist.get(x).getProtein();
            double calorie = fruitlist.get(x).getCalories();
            double fibers = fruitlist.get(x).getFibers();
            String portionSize = fruitlist.get(x).getPortionSize();

            displayInfo += String.format("%1$12s %2$7s  %3$7s%4$7s  %5$3s", name, protein, calorie, fibers, portionSize) ;
            displayInfo += "\n";
        }

        displayInfo += String.format("%1$12s %2$7s %3$7s%4$7s"," ====", "=======", "========", "=====")+ "\n" +
                       String.format("%1$12s %2$7s %3$8s%4$7s","Total", totalProtein(),totalCalorie(), totalFiber())+ "\n";

         displayInfo +=  "Size    : " + fruitlist.size() + "\n";
                        // "Capacity: "; //+ capacity() + "\n";

        return displayInfo;
    }
    
    /**
     * Find if FruitListArray x is equal to FruitListArray y.
     * @param f1 the other fruitList to be compared.
     * @return true if they are the same, false if not the same.
     */
    public boolean equals(FruitListArray f1)                                           
    {   
        boolean answer = false;
        for(int x = 0; x < fruitlist.size(); x++)
        {
            answer = this.fruitlist.get(x).equals(f1.fruitlist.get(x));
            if (answer == false)
            {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Main method to test the class.
     * Returns a message telling method is working.
     * @param args Main method.
     */
    public static void main(String[]args)      
    {
        System.out.print("Test driver in FruitListArray - doing nothing");
    }
}

   

