import java.util.*;

public class basic {

    public static void printLetters(String str) {
        for (char i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // // Strings are IMMUTABLE in Java
        // // we can't change the value of a string once it is created

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next();
        // System.out.print(name);

        // String fullName = "Divyanka Pagare";  
        // System.out.println(fullName.length()); //15

        //concatenation
        String firstName = "Ritesh";
        String lastName = "Girase";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        System.out.println(fullName.charAt(1));

        printLetters(fullName);
    }
}
