import java.util.*;
public class Anagaram {
    public static void main(String kar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=sc.nextLine();
        System.out.println("Enter the second string:");
        String s2=sc.nextLine();
        if(s1.length()==s2.length()){
            char[] c1=s1.toCharArray();
            char[]c2=s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1, c2)){
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }
        else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
