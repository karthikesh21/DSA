import java.util.*;
public class RemoveDuplicate {
    public static void main(String kar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");   
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:"); 
        int arr[] = new int[n]; 
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Set<Integer> unq = new HashSet<>();
        for(int i=0;i<n;i++){
            unq.add(arr[i]);
        }
        System.out.println("Unique elements in the array:");
        for(int num : unq){
            System.out.print(num + " ");
        }   
    }
}
