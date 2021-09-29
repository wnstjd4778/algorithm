import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val = br.readLine();
        int[] arr = new int[27];
        for(char i = 'a'; i <= 'z'; i++) {
            for(int j = 0; j < val.length(); j++) {
                if(val.charAt(j) == i) {
                    int num = i - 'a';
                    arr[num]++;
                }
            }
        }
        for(int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
