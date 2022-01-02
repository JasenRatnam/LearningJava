
package classobjectives;

/*  Programer: Jasen Ratnam
    Date: 2016-11-24
    Assignment 5
    Purpose: * To pratice basic concepts in object-oriented programming (OOP).
             * To gain experience with implementing a simple class in C++.
*/                // author presentation

public class ClassRectangle 
{
    public  int width;                                                           //variable int used in entire class, for the width
    public  int height;                                                          //variable int used in entire class, for the height
    public  String name;                                                         //variable string used in entire class, for the name
    public  char pen;                                                            //variable char used in entire class, for the pen to draw the rectangle
//    public  int wi;                                                              //used to simplifie rotate90 methode
//    public  int he;                                                              //used to simplifie rotate90 methode

    public ClassRectangle(int w, int h, char p, String name)                     //constructor methode
    {
        this.width = w;                                                          // use of 'this' is optional here - save the value of width
        this.height = h;                                                         // use of 'this' is optional here - save the value of heigth
        this.pen = p;                                                            // use of 'this' is optional here - save the value of the pen
        this.name = name;                                                        // use of 'this' is mandatory here - save the name
//        wi = this.width;                                                         //save value of width in here to use in toString method
//        he = this.height;                                                        //save value of heigth in here to use in toString method
    }
    
    public String toString()                                                     //method to drraw the rectangle
    {  
        String draw = "";                                                        //initalize string of the rectangle
        for(int y = 1; y <= height; y++)    //or for(int y = 0; y < height; y++) //start loop to print to skip line after pen is printed width times
        {
            for (int x = 1; x <= width; x++) //or for(int x = 0; y < width; x++) //start loop to print pen width time
            {
                 draw += pen + " ";                                              //System.out.print(pen); -  add pen and space each time loop is reapeated to draw
            }
            draw += "\n";                                                        //System.out.println(); - add a skip line each time loop is reapeated 
        }
        return draw;                                                             //return string draw which represents the rectangle
    }
                                                                               // returns the area of 'this' rectangle
    public  int area()                                                           //(int width, int height) - method to find the area
    {
         int area = this.width * this.height;
         return area;                                                            //return a int area
    }
    
    public  int perimeter()                                                      //(int width, int height) - method to find the perimeter
    {
        int perimeter = ((2 * this.width) + (2* this.height));
        return perimeter;                                                        //return int perimeter
    }
    
    public  String displayInfo()                                                 //method to make a string which displays the info of a recctaangle
    {
       String Info = ("--------------------\n" + 
                      " A Rectangle object \n" +
                      "--------------------\n" + 
                      "Name        : " + name + "\n" +
                      "Width       : " + width + "\n" +
                      "Height      : " + height + "\n" +
                      "Pen         : " + pen + "\n" +
                      "Area        : " + this.area() + "\n" +
                      "Perimeter   : " +  this.perimeter() + "\n" +
                      "--------------------");
       return Info;                                                              //return the string info
    }
//   public String rotate90()                                                    //method to make the methode toString rotate 90 degrees
//   {  
//       wi = this.height;
//       he = this.width;
//       return toString();                                                      //return the string of a rectangle rotated 90 degrees
//   }
 
    public void rotate90()                                                       //method to make the methode toString rotate 90 degrees
    { 
        int x = 0;                                                               //initialize int x to be uesd to hold width
        x = this.width ;                                                              //make x hold width
        this.width = this.height ;                                                    //make width equal to height                                   
        this.height = x;                                                         //make height equal to width by the use of x 
      
    }

    public String getName()                                                      //methode to get the name of the rectangle
    {   
        String name = this.name;
        return name;                                                             //return the name
    }
     
    public boolean sameSize(ClassRectangle t1)                                   //method to verify if rectangle t1 is same or not to rectangle t2
    {   
        if (this.width == t1.width && this.height == t1.height)
        {
            return true;                                                         //return true if they are the same
        }
        else
        {
            return false;                                                        //return true if they are not the same
        }
    }
             
    public static void main(String[] args) 
    {
        ClassRectangle t1 = new ClassRectangle(7, 4, '0', "Room");               //declare new rectangle named t1
        t1.rotate90();                                                           //make t1 rotate 90 degrees
        System.out.println(t1);                                                  //print t1 rotated 90 degrees
        System.out.println(t1.displayInfo());                                    //print dispalyinfo
        
        ClassRectangle t2 = new ClassRectangle(20, 4, '*', "Hallway");           //declare new rectangle named t2
        System.out.println(t2);                                                  //print t2 rectangle
        System.out.println(t2.displayInfo());                                    //print displalyinfo
        boolean result = t1.sameSize(t2);                                        //verify if t1 == t2
        System.out.printf("Rectangles named %s and %s are%sthe same size\n",     // print if t1 is the same or not
                           t1.getName(), t2.getName(), (result?" ":" not "));  
    }
}