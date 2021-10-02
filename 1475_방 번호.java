import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] check = new int[10];
        int max = 0;
        for(int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - '0';
            if(num == 9 || num == 6) {
                num = 9;
            }
            check[num]++;
        }
        if(check[9] % 2 > 0) {
            check[9] = check[9] / 2 + 1;
        } else {
            check[9] = check[9] / 2;
        }
        for(int i = 0; i < 10; i++) {
            max = Math.max(max, check[i]);
        }
        System.out.println(max);
    }
}

