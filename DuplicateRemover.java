package duplicateremover;

/**
 * @author ASHIWAJU
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateRemover {

    public static void main(String[] args) {
        // ArrayList with duplicate elements
        String a = "HELLO", b = "hello",g;
        boolean c;
        ArrayList<String> numbersList = new ArrayList<>(Arrays.asList("A", "C",
                "A","B", "B","D","R", "B","N","R", "H","A"));
         
        System.out.println(numbersList);
 
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(numbersList);
         
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);
         
        System.out.println(listWithoutDuplicates);
        c = a.equalsIgnoreCase(b);
        g = a.toLowerCase();
        switch(g){
            case "hello":
                System.out.println("Yea" + g);
                break;
            default:
                System.out.println("No");
                break;
        }
    }    
}
