import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String string=in.nextLine();
        StringBuilder str= new StringBuilder(string);
        int hour=(str.charAt(0)-48)*10+(str.charAt(1)-48);
        
        if(str.charAt(8)=='P')
        {   
            if(hour==12) hour-=12;
            hour+=12;
            str.replace(0,2,Integer.toString(hour));
        }
        else
            {
            if(hour==12)
                {
                str.replace(0,2,"00");
            }
        }
        System.out.println(str.delete(8,10));

    }
}