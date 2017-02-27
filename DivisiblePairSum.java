import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int count=0;
       Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        int a[] = new int[n];
    for(int a_i=0; a_i < n; a_i++){
        a[a_i] = in.nextInt();
       
    }
        if(n>=2 && n<=100 && k>=1 && k<=100)
         {
            for(int i=0;i<a.length;i++){
            if(a[i]>=1 && a[i]<=100)
		     {    for(int j=1;j<a.length;j++){
		              if(i<j){
		                  if((a[i]+a[j])%k==0)
		                      count++;
                        }             
                       }
              }
           }
        }       
        if(count>0)System.out.println(count);
   }
}