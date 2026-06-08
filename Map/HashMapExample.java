import java.util.*;
// HashMap is a class that implements the Map interface and uses a hash table to store key-value pairs. It allows for fast retrieval of values based on their keys, making it an efficient data structure for storing and accessing data. HashMap does not maintain any order of the elements, and it allows for null keys and values.
// In this example, we create a HashMap called "number" that maps Integer keys to String values. We add three key-value pairs to the HashMap using the put() method. We then remove the key-value pair with the key 2 using the remove() method and store the removed value in a variable called "removed". Finally, we print all the added numbers and the removed value to the console.
// Output:
   // Print all added items:{0=Potato, 1=Tomato, 2=Onion}
    // Print all added items:{0=Potato, 1=Tomato}
    // Removed:Onion




public class HashMapExample{
    public static void main(String[] args){

        HashMap<Integer,String> items = new HashMap<>();

        items.put(0,"Potato");
        items.put(1,"Tomato");
        items.put(2,"Onion");

        System.out.println("Print all added items:" + items);
        String removed = items.remove(2);
        

       

        System.out.println("Print items after removal:" + items);
        System.out.println("Removed:" + removed);
        

    }
}