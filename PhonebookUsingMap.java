//maps ....phonebook

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap phonebook=new HashMap();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name,phone);
            // Write code here
        }
        
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            boolean isAvailable=phonebook.containsKey(s);
            if (isAvailable)
                System.out.println(s+"="+phonebook.get(s));
            else
                System.out.println("Not found");
            
                }
         in.close();
        }
}
