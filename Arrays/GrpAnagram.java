import java.util.*;
public class GrpAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of string  elements:");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String s : arr) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        for(List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
