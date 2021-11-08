import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int type = 0;
        if(str.charAt(0) == '0') {
            if(str.charAt(1) == 'x') {
                type = 2;
            } else {
                type = 1;
            }
        }
        int sum = 0;
        if(type == 0) {
            System.out.println(Integer.parseInt(str));
        } else if(type == 1) {
            for(int i = str.length() - 1, j = 0; i >= 1; i--, j++) {
                sum += ((str.charAt(i)-'0') * Math.pow(8, j));
            }
            System.out.println(sum);
        } else {
            for(int i = str.length() - 1, j = 0; i >= 2; i--, j++) {
                int num = str.charAt(i)-'0';
                if(num >= 10) {
                    num -= 39;
                }
                sum += (num * Math.pow(16, j));
            }
            System.out.println(sum);
        }
    }
}
