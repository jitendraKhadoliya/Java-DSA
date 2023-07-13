import java.util.*; 
public class InputInJava{
    public static void main (String arg []){
        Scanner sc = new Scanner(System.in);
        String myString = sc.next();
        System.out.println( "my output" + myString);
        // float as input 
        System.out.println("choose input for string");
        // Scanner sc = new Scanner(System.in);
         float myFloat  = sc.nextFloat();
         System.out.println("Float input: " + myFloat);
        // System.out.print("Enter a float: ");
        // float myFloat = sc.nextFloat();
        // System.out.println("Float input: " + myFloat);
    }
}