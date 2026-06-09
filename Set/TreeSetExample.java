import java.util.*;

public class TreeSetExample{
    public static void main(String[] args){

        TreeSet<String> fine = new TreeSet<>();

        fine.add("Imprisonment");
        fine.add("Community Services");
        fine.add("Pay Charges");
        fine.add("Charges with Imprison");
        fine.add("Pay Charges");

        System.out.println("TreeSet :" +fine);
        boolean remove = fine.remove("Imprisonment");

        System.out.println("Print TreeSet :" + fine );

       
        System.out.println("Print first:" +fine.first());

        System.out.println("Poll Last element:"+ fine.pollLast());

        System.out.println("Now print the elements after operations performed :" + fine);
        
        fine.clear();
        System.out.println("Current elements : "+  fine);


    }
}
