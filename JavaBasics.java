/input
//42
//43.99
//welcome to hacker rank
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
	String s=scan.nextLine();
//if we use next line after nextxxx() then we dont get the string so to avoid this we need to use 2 nextline or buffer reader
//This problem occurs only for Scanner class, due to nextXXX() methods ignore newline character and nextLine() only reads newline character. If we use one more 
//call of nextLine() method between nextXXX() and nextLine(), then this problem will not occur because nextLine() will consume the newline character.
        

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}