import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        BigInteger a=new BigInteger(Integer.toString(in.nextInt()));
        BigInteger b=new BigInteger(Integer.toString(in.nextInt()));
        BigInteger c=new BigInteger("0");
        int i=2,n=in.nextInt();
            while(i<n)
            {
                c=a.add(b.multiply(b));
                a=b;
                b=c;
                i++;
            }
            System.out.println(c);
    }
}