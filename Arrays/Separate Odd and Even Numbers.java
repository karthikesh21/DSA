// You are given an array of integers. Your task is to separate the odd and even numbers into two different arrays and print them.
// Print all the odd numbers in the order they appear in the array.
// Then, print all the even numbers in the order they appear in the array.
// If there are no odd numbers, print "No odd elements"
// If there are no even numbers, print "No even elements"
// Sample Input 0
// 6
// 1 2 3 4 5 6
// Sample Output 0
// 1 3 5
// 2 4 6

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int even[] = new int[n];
        int odd[] = new int[n];
        int evi = 0, odi = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even[evi] = arr[i];
                evi++;
            } else {
                odd[odi] = arr[i];
                odi++;
            }
        }

        if (odi == 0) {
            System.out.println("No odd elements");
        } else {
            for (int i = 0; i < odi; i++) {
                System.out.print(odd[i] + " ");
            }
            System.out.println(); 
        }

        if (evi == 0) {
            System.out.println("No even elements");
        } else {
            for (int i = 0; i < evi; i++) {
                System.out.print(even[i] + " ");
            }
        }
    }
}
