//Given a positive integer and a range [low, high], sum the digits that fall within the range (inclusive).
//Sample Input 123 2 4
//Sample Output 5

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int low=sc.nextInt();
        int high=sc.nextInt();
        int sum=0;
        while(n>0){
            int res=n%10;
            if(res>=low && res<=high){
                sum+=res;
            }
            n/=10;
        }
        System.out.println(sum);
    }
}
