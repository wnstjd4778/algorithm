import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int[] arr = new int[26];
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            for(int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    arr[str.charAt(i) - 'a']++;
                }
            }
        }
        for(int i = 0; i < 26; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (max == arr[i]) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}
