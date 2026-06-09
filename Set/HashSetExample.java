import java.util.*;
// HashSet is a class that implements the Set interface and 
// uses a hash table to store unique elements. 
// It does not allow duplicate values and does not maintain any order of the elements. 
// HashSet allows for null values but does not allow null keys.

// In this example, we create a HashSet called "fruits" that stores String values.
//  We add several fruit names to the HashSet using the add() method.
//  We then attempt to add a duplicate fruit name ("Apple") to the HashSet, 
// which will not be added since HashSet does not allow duplicates. 
// Finally, we print the contents of the HashSet to the console.


public class HashSetExample{
    public static void main(String[] args){
        HashSet<String> fruits=new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Apple"); // This will not be added since it's a duplicate

       
        System.out.println("Fruits in the HashSet: " + fruits);

    }
}
