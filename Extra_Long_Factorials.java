import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        BigInteger fact=new BigInteger("1");
        for(int i=1;i<=n;i++)
            fact=fact.multiply(new BigInteger(Integer.toString(i)));
        System.out.println(fact);
    }
}