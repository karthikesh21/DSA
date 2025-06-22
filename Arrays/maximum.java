import java.util.*;
public class maximum{
    public static void main(String kar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
         }
         System.out.println("Largest element is: " + max);
        }
    }

