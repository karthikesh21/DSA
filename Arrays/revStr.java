import java.util.*;

public class revStr {
    public static void main(String[] kar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.print("[");
        for(int i=n-1;i>=0;i--){
            System.out.print("\""+arr[i]+"\"");
            if(i!=0){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
