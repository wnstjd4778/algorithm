import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }
        int index = -1;
        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(arr[i] % 2 != 0) {
                count++;
                index = i;
                arr[i]--;
                if(count > 1) {
                    System.out.println("I'm Sorry Hansoo");
                    System.exit(0);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(arr[i] > 0 && arr[i] % 2 == 0) {
                for(int j = 0; j < arr[i] / 2; j++) {
                    sb.append((char) (i + 'A'));
                }
            }
        }
        if(count == 1) {
            sb.append((char)(index + 'A'));
        }
        for(int i = 25; i >= 0; i--) {
            if(arr[i] > 0) {
                for(int j = 0; j < arr[i] / 2; j++) {
                    sb.append((char) (i + 'A'));
                }
            }
        }
        System.out.println(sb);
    }
}


