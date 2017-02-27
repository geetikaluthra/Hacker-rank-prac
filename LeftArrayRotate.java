//left rotate array 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        
    static void  printArray(int a[],int d, int n) 
    {
        for(int i=0;i<n;i++){
            System.out.print(a[(i+d)%n] + " ");
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];
    for(int a_i=0; a_i < n; a_i++){
        a[a_i] = in.nextInt();
  
        
        
    }
        printArray(a,d,n);
    
    } 
   
    
 
}
