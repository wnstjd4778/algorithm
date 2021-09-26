import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int size = a.length();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = a.charAt(i) - '0';
        }
        Arrays.sort(arr);
        for(int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
