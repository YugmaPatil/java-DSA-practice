import java.util.*;

public class LinkedListExample{
    public static void main(String[] arg){
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C and C++");
        stack.push("R");

          System.out.println("Stack:" + stack);

        String removed= stack.remove(1);
        System.out.println("Removed element : "+ removed);

        System.out.println("Print remaining stack :" + stack);

    }
} 
