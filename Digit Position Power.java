//Given a positive integer, raise each digit to the power of its position (1-based, right to left) and sum the results.
//Sample Input 123
//Sample Output 8


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rani=1;
        int kar=0;
        while(n>0){
            int res=n%10;
            kar+=Math.pow(res,rani);
            rani++;
            n/=10;
        }
        System.out.println(kar);
    }
}
