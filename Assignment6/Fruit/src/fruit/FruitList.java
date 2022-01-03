package fruit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Read a file and find the listed fruits, and their description, and save them in a array named fruitList, and display them.
 * Find the maximum protein, calorie and fiber.
 * Find if x fruitList is equal to y fruitList.
 * Assignment 1_B
 * Date : 2017-01-30
 * @author Jasen Ratnam
 */
public class FruitList 
{
    private Fruit [] fruitList;
    private  int  fruitCount;
    private final static int DEFAULT_SIZE = 10;
    
    /**
     * Initializes a newly created FruitList object of default size.
     * Constructor to create a Fruit array of default size and make fruitCount = 0.
     * Default size = 10 as previously shown.
     * Do same thing as other constructor with cap = to DEFAULT_SIZE.
     */
    public FruitList ()
    {
        this(DEFAULT_SIZE);
    }
    
    /**
     * Initializes a newly created FruitList object of a given capacity.
     * Constructor to create a Fruit array of size 'cap'and make fruitCount = 0.
     * This method is used to make the first constructor.
     * @param cap = size of the FruitList array to be constructed.
     */
    public FruitList(int cap)
    {
        fruitList =new Fruit [cap];
        fruitCount = 0;
    }

    /**
     * Find the total size of the array given.
     * Found by .length of the fruitList.
     * @return the size of the array.
     */
    public int capacity()
    {
      return fruitList.length;
    }
    
    /**
     * Finds if the array is empty.
     * @return True if fruitCount is equal to 0.
     */
    public boolean isEmpty()
    {
        return fruitCount == 0;
    }
    
    /**
     * Finds if the array is full.
     * Method capacity used to find the size of the array. 
     * @return True if fruitCount is equal to the size of the array.
     * 
     */
    public boolean isFull()
    {
        return fruitCount == capacity();
    }
    
    /**
     * Add a fruit to the end of a fruitList. 
     * If the list is full, a error message will be shown and method returned, the isFull method used here.
     * Else add 1 to the fruitCount and at the Fruit to the end of the list using the array.
     * @param f The Fruit given to be added at the end of a fruitList.
     */
    public void addToEnd(Fruit f)
    {
        if (isFull())
        {
            System.out.println("List overflow - Request rejected");
            return;
        }  
        
        fruitList [fruitCount] = new Fruit(f);
        ++fruitCount;
    }
    
    /**
     * Add a fruit to the front of a fruitList.
     * If the list is full, a error message will be shown and method returned, the isFull method used here.
     * A loop is created to make all the fruits move by one in the fruitList.
     * Loop ends when the fruitCount is equal to 0.
     * Add given fruit f to fruitCount 0 'position' in fruitList and 1 to fruitCount.
     * @param f The Fruit given to be added at the front of a fruitList.
     */
    public void addToFront(Fruit f)
    {
        int position = 0;
        if (isFull())
        {
            System.out.println("List overflow - Request rejected");
            return;
        }
        for (int k = fruitCount; k > position; --k)
        {
            fruitList [k] = fruitList [k-1];
        }
        fruitList[position] =  new Fruit(f);
        ++fruitCount;
    }
    
    /**
     * Method to load the given file, with the fruitList.
     * If the file does not exist return an error message and exit.
     * Else create a Scanner named fileScan which scans the file given by the user.
     * Read files and save Name, portionSize, protein, calories and fibers.
     * Create a fruit with found info and add to the end of the frutiList if list is not full, using addToEnd method.
     * If list is full return error message.
     * @param fileName is the name of the file with the fruitList given by the user.
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

                if (!isFull())
                {
                   addToEnd(f);
                }
                else
                {
                    System.out.println("Fruit list is full");
                    return ;
                } 
            }
            System.out.println("Sucessfully opened input file named" + fileName);
            System.out.println("Fruit records processed: " + fruitCount);
            System.out.println("Fruit list size: " + fruitCount + " Capacity: " + capacity());
        }
    }
     
    /**
     * Find the Fruit with maximum amount of calorie.
     * Assume that the first fruit as the maximum amount calories.
     * Does a loop to find if any other Fruit as a higher calorie value.
     * If found make that the maxPos.
     * @return the Fruit with the maximum Calorie value.
     */
    public Fruit maxCalorie()
    {
        int maxPos = 0;
        for(int x = 0; x < capacity(); x++)
        {
            if( fruitList [x].getCalories() > fruitList[maxPos].getCalories())
                {
                    maxPos = x;
                }
        } 
        return fruitList [maxPos];
    }
    
    /**
     * Find the Fruit with minimum amount of calorie.
     * Assume that the first fruit as the minimum amount calories.
     * Does a loop to find if any other Fruit as a lower calorie value.
     * If found make that the minPos.
     * @return the Fruit with the minimum Calorie value.
     */
    public Fruit minCalorie()
    {
        int minPos = 0;
        for(int x = 0; x < capacity(); x++)
        {
            if( fruitList [x].getCalories() < fruitList[minPos].getCalories())
                {
                    minPos = x;
                }
        } 
        return fruitList [minPos];
    }
     
    /**
     * Find the Fruit with maximum amount of Protein.
     * Assume that the first fruit as the maximum amount Protein.
     * Does a loop to find if any other Fruit as a higher Protein value.
     * If found make that the maxPos.
     * @return the Fruit with the maximum Protein value.
     */
    public Fruit maxProtein()
    {
        int maxPos = 0;
        for(int x = 0; x < capacity(); x++)
        {
            if( fruitList [x].getProtein() > fruitList[maxPos].getProtein())
                {
                    maxPos = x;
                }
        } 
        return fruitList [maxPos];
    }
    
    /**
     * Find the Fruit with minimum amount of Protein.
     * Assume that the first fruit as the minimum amount Protein.
     * Does a loop to find if any other Fruit as a lower Protein value.
     * If found make that the minPos.
     * @return  the Fruit with the minimum Protein value.
     */
    public Fruit minProtein()
    {
        int minPos = 0;
        for(int x = 0; x < fruitCount; x++)
        {
            if( fruitList [x].getProtein() < fruitList[minPos].getProtein())
                {
                    minPos = x;
                }
        } 
        return fruitList [minPos];
    }
    
    /**
     * Find the Fruit with maximum amount of Fiber.
     * Assume that the first fruit as the maximum amount Fiber.
     * Does a loop to find if any other Fruit as a higher Fiber value.
     * If found make that the maxPos.
     * @return the Fruit with the maximum Fiber value.
     */
    public Fruit maxFiber()
    {
        int maxPos = 0;
        for(int x = 0; x < capacity(); x++)
        {
            if( fruitList [x].getFibers() > fruitList[maxPos].getFibers())
                {
                    maxPos = x;
                }
        } 
        return fruitList [maxPos];
    }
    
    /**
     * Find the Fruit with minimum amount of Fiber.
     * Assume that the first fruit as the minimum amount Fiber.
     * Does a loop to find if any other Fruit as a lower Fiber value.
     * If found make that the minPos.
     * @return the Fruit with the minimum Fiber value.
     */
    public Fruit minFiber()
    {
        int minPos = 0;
        for(int x = 0; x < capacity(); x++)
        {
            if( fruitList [x].getFibers() < fruitList[minPos].getFibers())
                {
                    minPos = x;
                }
        } 
        return fruitList [minPos];
    }
    
    /**
     * Method to use to make double results to 2 decimal points.
     * @param val The value needed to be formated.
     * @return The formated value.
     */
    public double Dec2(double val)
    {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(val));
    }
    
   
    /**
     * Find the total protein level of all fruits from the list combined.
     * Add the protein value of each fruit to 'totalP' using the getProtein method.
     * @return value of totalProtein
     */
    public double totalProtein()
    {
        double totalP = 0;
        for(int x = 0; x < fruitCount; x++)
        {
            totalP += fruitList [x].getProtein();     
        } 
        return Dec2(totalP);
    }
    
    /**
     * Find the total calorie level of all fruits from the list combined.
     * Add the calorie value of each fruit to 'totalC' using the getCalories method.
     * @return value of totalCalories
     */
    public double totalCalorie()
    {
        double totalC = 0;
        for(int x = 0; x < fruitCount; x++)
        {
            totalC += fruitList [x].getCalories();     
        } 
        return Dec2(totalC);
    }
    
    /**
     * Find the total fiber level of all fruits from the list combined.
     * Add the fiber value of each fruit to 'totalF' using the getFibers method.
     * @return value of totalFibers
     */
    public double totalFiber()
    {
        double totalF = 0;
        for(int x = 0; x < fruitCount; x++)
        {
            totalF += fruitList [x].getFibers();     
        } 
        return Dec2(totalF);
    }
    
    @Override
    public String toString()
    { 
         String displayInfo = String.format("%1$12s %2$7s %3$7s%4$7s  %5$7s", "Name", "Protein", "Calories", "Fiber", "Portion size") ;
         displayInfo += "\n";
         displayInfo += String.format("%1$12s %2$7s %3$7s%4$7s  %5$7s"," ====", "=======", "========", "=====", "============") ;
         displayInfo += "\n";
         
        for(int x = 0; x < fruitCount; x++)
        {
            String name = fruitList[x].getName();
            double protein = fruitList[x].getProtein();
            double calorie = fruitList[x].getCalories();
            double fibers = fruitList[x].getFibers();
            String portionSize = fruitList[x].getPortionSize();
            
            displayInfo += String.format("%1$12s %2$7s  %3$7s%4$7s  %5$3s", name, protein, calorie, fibers, portionSize) ;
            displayInfo += "\n";
        }
        
        displayInfo += String.format("%1$12s %2$7s %3$7s%4$7s"," ====", "=======", "========", "=====")+ "\n" +
                       String.format("%1$12s %2$7s %3$8s%4$7s","Total", totalProtein(),totalCalorie(), totalFiber())+ "\n";
             
         displayInfo +=  "Size    : " + fruitCount + "\n" +
                         "Capacity: " + capacity() + "\n";

        return displayInfo;

    }
    
    /**
     * Find if fruitList x is equal to fruitList y.
     * @param f1 the other fruitList to be compared.
     * @return true if they are the same, false if not the same.
     */
    public boolean equals(FruitList f1)                                           
    {   
        boolean answer = false;
        for(int x = 0; x < capacity(); x++)
        {
            answer = this.fruitList [x].equals(f1.fruitList[x]);
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
        System.out.print("Test driver in FruitList - doing nothing");
    }

}
    
    
    

