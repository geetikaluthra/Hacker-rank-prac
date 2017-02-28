//caesar cipher
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        if(n>=1 && n<=100 && k>=0 && k<=100)
      {      
        k=k%26;
        char ch;
        for(int i=0;i<n;i++)
            {
                 ch=s.charAt(i);
                 int ascii=(ch+k);
            
            //upper alphabets
            if(ch>=65 && ch<=90 )
                System.out.print((char)(((ascii-65)%26)+65)); 
            
            //check for lowercase alphabets
            else if(ch>=97 && ch<=122){
               System.out.print((char)(((ascii-97)%26)+97)); 
            }
            //print others as it is
            else
                System.out.print((char)ch);
                
        }
     }
    }
}

