import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
     if(t>=1 && t<=1000){   
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if(n>=2 && n<=1000)
                {
                  int k = in.nextInt();
                    if(k>=2 && k<=n)
                          {  int max=0;
                            for (int i = 0; i < n; i++) {
                            for (int j = i + 1; j <= n; j++) {
                                if((i&j)<k){
                                    if(max<(i&j)){
                                    max=(i&j);
                                    }
                                }
                            }
                        }
        System.out.println(max);
            }
        }
      }   
    }
  }
}    