//Sample Input

welcometojava
3
Sample Output

ava
wel
Explanation

Here is the list of all substrings of length :

wel
elc
lco
com
ome
met
eto
toj
oja
jav
ava
Among them ava is the smallest and wel is the largest.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int x=s.nextInt();
        SortedSet<String> set=new TreeSet<String>();
        for(int i=0;i<=a.length()-x;i++)
            set.add(a.substring(i,i+x));
        System.out.println(set.first());
        System.out.println(set.last());
        
    }
}
