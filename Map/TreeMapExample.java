import java.util.TreeMap;

// TreeMap is a part of Java's Collections Framework and implements the Map interface. It stores key-value pairs in a sorted order based on the natural ordering of the keys or by a specified comparator. TreeMap does not allow null keys but allows null values. It provides log(n) time complexity for basic operations like get, put, and remove.
// In this example, we create a TreeMap that maps Integer keys to String values. We add some key-value pairs, print the TreeMap, remove a key, and print the TreeMap again to show the changes.
// Note that the keys are automatically sorted in ascending order, which is a characteristic of TreeMap.
// Output:
// TreeMapped :{0=Advance skills, 1=Basic skills, 2=Beginner skills, 3=Intermediate skills}
// Removed value: Basic skills
// After removal: {0=Advance skills, 2=Beginner skills, 3=Intermediate skills}


public class TreeMapExample{
    public static void main(String[] args){
        TreeMap<Integer, String> insert = new TreeMap<>(); 

        insert.put(0, "Advance skills");
        insert.put(1, "Basic skills");
        insert.put(3, "Intermediate skills");
        insert.put(2, "Beginner skills");

        System.out.println("TreeMapped :" + insert);

        String remove = insert.remove(1);
        System.out.println("Removed value: " + remove);
        System.out.println("After removal: " + insert); 
    }
}
