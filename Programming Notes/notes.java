// Programer: Ratnam Jasen
// Date: 2016-08-25
// Purpose:

import java.util.Scanner; // Needed for input from user


public class notes
{
	public static void main(String[] args)
	{	// prompt user
		Scanner input = new Scanner(System.in);
		System.out.print("ask for info:");
		double input = input.nextInt(); // Save input

		// Compute
		double calc = input * 100;  // Calulation

		//Dispaly results
		System.out.println("answer is " + calc + " goes" );
	}
}

//String in two lines
System.out.println("Introduction to Java Programming" + "\n" /*to next line*/ +
"is boring");

// A variable is:
double hello = 78

// A constant is:
final double YOLO = 89

// To make calculate an exponant
2^3 = Math.pow (2,3);

int i;
i+ = 8 :  i = i + 8
i- = 8 :  i = i - 8
i* = 8 :  i = i * 8
i/ = 8 :  i = i / 8
i% = 8 :  i = i % 8

int j : int i =1
j = ++i : j =2 : i =2
j = i++ : j =1 : i =2
j = --i : j =0 : i =0
j = i-- : j =1 : i =0


// if statement

if(a > 0 || a >= 10)
{
	System.out.println("");
}

else if (a = 0)
{
	System.out.println("");
}

else
{
	System.out.println("");
}

// Switch statement

int l;
int k = 5;

switch (k)
{
	case 1 : l = 5 *6;
			break;
	case 2 : l = 5 *10;
			break;
	.....
	default : l = 10
			break;
}


// Random numbers.

0 <= Math.random() < 1.0
int number 1 = (int)(Math.random() *10);

or
Random rand = new Random();
int r = rand.NextInt();

//loop
//while loop

while(/*loop-continuation-condition*/)
{
	//loop body
	//statement(s);
}


//do-while loop

do
{
	//loop body
	//statement(s);
}while(/*loop-continuation-condition*/);

//for loop

for(i = initial value; i < end value; i++)
{
	//loop body
	//statement(s);
}

for(initial-action; loop-continuation-condition; action-after-each-iteration)
{
	//loop body
	//statement(s);
}

//methods

//if input is not an int
public static int readNextInt(Scanner input) // create method to make sure an input is a int
{
	while (!input.hasNextInt()) //if input is not a int
	{
		String badInput = input.next(); //consume the bad input
		System.out.print("Bad input '" + badInput +
						"'. Please enter an integer.");
	}
	return input.nextInt(); //return for new int
}

public static int               readNextInt(Scanner input)
//modifier    returnValueType   methodName (list of parameters)
{
	//methode body;
	//statement(s);
	//return value;
}

//invoke a method
int z = readNextInt(Scanner input);


//decalre Arrays:
  int        [] x           = new int         [26]; // create 26 memory allocution

//elementType[] arrayRefVar = new elementType [arraySize];

//save in a array

x[0] = 10;
x[2] = 50;

//examle test 3;
public class TVChannel
{
    //Step 1: instance variable
    private String name;
    private int number;
    private int rank;
    private boolean status;

    //Step 2: normal constructor
    public TVChannel (String name, int number, int rank, boolean status)
    {
        //note: 'this' refers to the object under construction
        this.name = name;
        this.number = number;
        this.rank = rank;
        this.status = status;
    }

    //step3: default constructor
    public TVChannel()
    {
        this.name = "CNN";
        this.number = 500;
        this.rank = 9;
        this.status = true;
    }

    //step4: getter methods
    public String getName()
    {
       return name;
    }

    public int getNumber()
    {
         return number;
    }

    public int getRank()
    {
         return rank;
    }

    public boolean getStatus()
    {
         return status;
    }

    //step5: setter methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    //step6: verify if same channel
    public boolean equals(TVChannel otherChannel)
    {
        // compare 'this channel and other channel
        boolean result = this.number == otherChannel.number && this.name.equals(otherChannel.name);
        return result;
    }

    //step7: reception Type
    public String receptionType()
    {
        if (status)
        {
            return "cable";
        }
        else
        {
            return "Antenna";
        }
    }

    //step8: toString
    public String toString()
    {
        String result = "Channel Summary\n";
        result += "================\n";
        result += "Name : " + this.name + "\n";
        result += "Number : " + this.number + "\n";
        result += "Rank : " + this.rank + "\n";
        result += "Reception : " + this.receptionType() + "\n";
        result += "================\n";
        return result;
    }

    //step 9:name new channel
    public static void main(String[] args)
    {
      TVChannel tv1 = new TVChannel("VTV", 123, 7, false);
      tv1.setStatus(true);
      System.out.println(tv1);
      System.out.println("Reception type: " + tv1.receptionType());
      TVChannel tv2 = new TVChannel("CBC", 286, 9, true);
      if (tv1.equals(tv2))
      {
        System.out.println(tv1.getName() + "and" + tv2.getName() + " are equal");
      }
      else
      {
          System.out.println(tv1.getName() + "and" + tv2.getName() + " are  not equal");
      }
    }

}


//Chapter 7

//Arrays:

// Once an array is created, its size is fixed.
// An array reference variable is used to access the elements in an array
// using an index.


// Declare an array variable:
elementType[] arrayRefVar;
// elementType can be any data type: int, double, etc.

// Does not allocate any space in memeory for the array
// Creates only a storage location for the reference to an array.

// Create an array by using the new operator:
arrayRefVar = new elementType[arraySize];
// Assigns the reference of the new array to the variable arrayRefVar.


//Foreach Loops
for(elementType element: arrayRefVar)
{
	//process the element.
}

//Copying Arrays
int[] sourceArray = {2,3,1,5,10};
int[] targetArray = new int[sourceArray.length];

for(int i = 0; i < sourceArray.length; i++)
{
	targetArray[i] = soureArray[i];
}


//chapter 11

// A superclass’s constructor is not inherited; they are invoked explicitly or implicitly.
// It is invoked explicitly by using the super keyword.
super.x();

// A class is made into a subclass when it extends the superclass.
public class subClass extends superClass {}

// If the keyword super is not explicitly used, the superclass’s default constructor is automatically invoked.
// The super’s constructor can only be invoked from the subclasses’ constructors.

// It must be the first statement in the subclasses constructor.
// The keyword super can be used to call a superclass’s constructor or method.

// A subclass inherits from a superclass.
// In a subclass you can:
//                       * add new properties.
//                       * add new methods.
//                       * Override the methods of the superclass.


//A super’s method is overriding when the subclass creates a method with the same name.

// Overriding a super's method.
// If the variable in both methods are the same, the method is being overridden.

public class superclass(Double x)
{
	public String toString()
	{
	}
}
public class subClass(Double x) extends superclass
{
	@override
	public String toString()
	{
	}
}

// Only public methods can be overridden.
// A Static method cannot be overridden.


// Overloading a super's metod.
// If the variables are different, the methods are being overloaded.

public class superclass(Double x)
{
	public String toString()
	{
	}
}
public class subClass(int x) extends superclass
{
	@override
	public String toString()
	{
	}
}

//Casting objects:
//Convert an object of one class type to another.

//implicit casting:
Object o = new Student ();

//This statement is implicit casting because Student must be an instance of object.

//explicit casting:
Student b = (Student) Object o;

//This statement is explicit because object may not be an instance of Student.
//We need to tell the compiler that o is a Student object, using an explicit casting.


//A subclass cannot weaken the accessibility of a method from the super when override.
//When overriding a method, it can be made more visible but not less.


//Chapter 13:
// An abstract method must be in an abstract class.
// A subclass may be abstract even if the superclass is oncrete.
// A method from the superclass can be overriden in a subclass as an abstract method.

//interface:
// An interface is a class like construct that contains only constants and abstract methods.
// It is similar to an abstract class but with the intent to specify common behavior for objects.

public interface InterfaceName
{
	constant declarations;
	abstract method signatures;
}

//Example:
public interface Edible
{
	/** Describe how to eat */
	public abstract String howToEat();
}

//in an interface:
//                *All data fields are public final static.
//                *All methods are public abstract in an interface
// therefor modifiers can be removed in an interface.

//there for:
public interface T1
{
	 public static final int K = 1;

	 public abstract void p();
}

// is the same as:
public interface T1
{
	 int K = 1;

	 void p();
}



// Chapter 7
// Sorting arrays.
// Sorting is a common task in computer programming.
// There are many different algorithms developed for sorting.

// Selection Sort:
// - Finds the smallest number in the list and swap it with the first.
// - Then finds the smallest number remaining and swaps it with the second.
// - Continue until the list contains only a single number.

// Example of selection sort:
2 9 5 4 8 1 6
1 9 5 4 8 2 6
1 2 5 4 8 9 6
1 2 4 5 8 9 6
1 2 4 5 6 9 8
1 2 4 5 6 8 9

public static void selectionSort(double[] list)
{
	for (int i = 0; i < list.length; i++)
	{ 	// Find the minimum in the list[i..list.length-1]
		double currentMin = list[i];
		int currentMinIndex = i;
		for (int j = i + 1; j < list.length; j++)
		{
			if (currentMin > list[j])
			{
				currentMin = list[j];
				currentMinIndex = j;
			}
		}
		// Swap list[i] with list[currentMinIndex] if necessary;
		if (currentMinIndex != i)
		{
			list[currentMinIndex] = list[i];
			list[i] = currentMin;
		}
	}
}

// The arrays class:
// Java provides several overloaded sort methods for sorting an array of int, double, char, short, long and float.

double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
java.util.Arrays.sort(numbers);

char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
java.util.Arrays.sort(chars);

Arrays.toString(list); // Used to return a String representation for the list.


// Chapter 20.
// Collections:
// A collection is  a container object that holds a group of objects, elements.
// Three types of collections: lists, sets, and maps.

// Iterators:
// Iterator.hasNext(); retruns true if this iterator has more elements to traverse.
// Iterator.next(); returns the next element from this iterator.
// Iterator.remove(); removes the last element obtained using the next method.

// The list interface:
// A list stores elements in a sequential ordeer, and allows the user to specify where the element is stored.
// The user can acces the elements by index.

// ArraysList and Linked list:
// Concrete implementations of the List interface.
// ArrayList is more efficent when you need to support random access through an index without inserting or removing elements from any place other than the end.
// LinkedList is more efficent whenyour application requires the insertion or deletion of elements from any place in the list.
// A list can grow or shrink dynamically, as needed. An array is fixed once it is created.
// If your application does not require insertion or deletion of elements, Array is more efficent.

// The Comparator interface:
// If you want to compare elements of different types that are not instances of Comparable or are not comparable.
// You can define a comparator to compare these elements.

// Exemple:
public int compare(Object element1, Object element2);
// Returns a negative value if element1 is less than
// element2, a positive value if element1 is greater than
// element2, and zero if they are equal.

// The vector class:
// Vector is the same as ArrayList, except that Vector contains methods to access and modify the vector.

// The Stack Class:
// Represents a last-in-first-out stack of objects.
// Elements are accessed only from the top of the stack.
// you can retrieve, insert, or remove an element from the top of the stack.

.Stack();  // Creates an empty stack.
.empty();  // Returns true if this stack is empty.
.peek();  // Returns the top element in this stack.
.pop();  // Returns and removes the top element in this stack.
.push(E);  // Adds a new element to the top of this stack.
.search(object);  // Returns the position of the specifed element in this stack.

// Queues and Priority Queues:

// Queues:
// A first-in/first-out data structure.
// Elements are added to the end of the queue.
// Elements are removed from the beginning of the queue.

// Priority queues:
// Elements are assigned prioties.
// Element with the highest priority is removed first.

// Chapter 21
// Sets and Maps.

// Sets:
// Sets and List are subinterfaces of collections.
// The Set interface extends the Collection interface.
// A set has no new methods or constants.
// But a Set contains no duplicate elements.
// Concrete classes that implements Set must ensure that no duplicate elements can be added to the set.

// AbstractSet class:
// This is a abstract clas.
// Convenience class that extends AbstractCollection and implements Set.
// Provides concrete implementations for the equals and the hashCode method.
// Hash code of a set is thesum of the hash code of all the elements in the set.

// Maps:
// Represents a group of objects, each of which is associated with a key.
// You can get the object from a map using a key.
// You have to use a key to put the object into the map.

// HashMap and TreeMap:
// Concrete implementations of the Map interface.
// HashMap class: efficient for locating a value, inserting a mapping, and deleting a mapping.
// TreeMap class: implementing SortedMap, efficient for traversing the keys in a sorted order.

// LinkedHashMap:
// Extends HashMap with a linked list implementation that supports an ordering of the entries in the map.
// Entries can be retrieved in the order in which they were inserted into the map or the order in which they were last accessed, from least recently accessed to most recently.


// Chapter 23:
// Bubble Sort:
// Compare first 2 value, if second is smaller than the first make it the first. else continue to next pair.


// Chapter 25:
// Binary trees:
// A hierarchical structure.
// Either empty or consists of an element, called the root, and two distinct binary trees, called the left subtree and right subtree.
// Each element: Node.
// First center element: Root.
// Root of left subtree of a node: left child of the node.
// Root of right subtree of a node: right child of the node.

// Binary search tree:
// For every node in the tree the value of any node in its left subtree is less than the value of the node
// And for  every node in the tree the value of any node in its right subtree is greater than the value of the node.

// Inserting an element to binary search tree:
// If the tree is empty: create a root node with the new element.
// Else, place it at the left if smaller or rigth if bigger.

// Tree traversal:
// Process of visiting each node in the tree exactly once.

                       60
                      /  \
                    /      \
                   55      100
                  /  \    /   \
                 45  57  67   107
                      \      /
                      59   101
// Inorder:
// - Visit left subtree of the current node first recursively,
// - Then the current node itself,
// - And finally the right subtree of the current node recursively.
45 55 57 59 60 67 100 101 107

// Postorder:
// - Visit the left subtree of the current node first,
// - Then the right subtree of the current node,
// - And finally the current node itself.
45 59 57 55 67 101 107 100 60

// Preorder:
// - Visit the current node first,
// - Then the left subtree of the current node recursively,
// - And finally the right subtree of the current node recursively.
60 55 45 57 59 100 67 107 101








