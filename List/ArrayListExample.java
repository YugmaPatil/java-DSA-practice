import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("ArrayList: " + animals);
        System.out.println("First animal: " + animals.get(0));

        animals.remove("Cat");
        System.out.println("After removal: " + animals);
        System.out.println("Size: " + animals.size());

        Collections.sort(animals);
        System.out.println("Sorted: " + animals);

        Collections.reverse(animals);
        System.out.println("Reversed: " + animals);
    }
}
