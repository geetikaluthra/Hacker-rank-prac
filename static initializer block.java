//static initializer block....area of a parralelogram
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static boolean flag = true;
static Scanner s=new Scanner(System.in);
static int B=s.nextInt();
static int H=s.nextInt();

static{
    try{
        if(B<0||H<0)
            {
                flag=false;
                throw new Exception("Breadth and height must be positive");
        }
            
    }
    catch(Exception e){
        System.out.println(e);
    }
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of 