import java.util.*;
public class JAVALAB1A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q1 Part 1");
        System.out.println("Enter the string :");
        String string = sc.nextLine();
        String last = string.substring(string.length()-1);
        System.out.println("new string with the last char added at the front and back :");
        System.out.println(last+string+last);
        System.out.println("****************************************");
        System.out.println("Q1 Part 2");
        String newstring = string.substring(1,string.length()-2);
        String first = string.substring(0);
        System.out.println(" new string where the first and last chars have been exchanged :");
        System.out.println(last+newstring+first);
    }
}