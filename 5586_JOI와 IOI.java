import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < arr.length - 2; i++) {
            if(arr[i] == 'J') {
                if(arr[i + 1] == 'O') {
                    if(arr[i + 2] == 'I') {
                       count1++;
                    }
                }
            }
            if(arr[i] == 'I') {
                if(arr[i + 1] == 'O') {
                    if(arr[i + 2] == 'I') {
                        count2++;
                    }
                }
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
