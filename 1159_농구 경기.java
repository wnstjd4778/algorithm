import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            int num = str.charAt(0) - 'a';
            arr[num]++;
        }
        boolean flag = false;
        for(int i = 0; i < 26; i++) {
            if(arr[i] >= 5) {
                System.out.print((char)(i + 'a'));
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("PREDAJA");
        }
    }
}
