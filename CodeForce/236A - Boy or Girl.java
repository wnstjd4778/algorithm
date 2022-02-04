import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       int[] arr = new int[26];
       for(int i = 0; i < str.length(); i++) {
           int num = str.charAt(i) - 'a';
           arr[num]++;
       }
       int count = 0;
       for(int i = 0; i < 26; i++) {
           if(arr[i] != 0) {
               count++;
           }
       }
       if(count % 2 == 0) {
           System.out.println("CHAT WITH HER!");
       } else {
           System.out.println("IGNORE HIM!");
       }
    }
}
