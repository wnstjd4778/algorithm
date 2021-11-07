import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int size = str.length();
        if(size % 3 == 2) {
            str = "0" + str;
        }
        if(size % 3 == 1) {
            str = "00" + str;
        }
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if(i % 3 == 2) {
                a = num * 1;
                sb.append(a + b + c);
            } else if(i % 3 == 1) {
                b = num * 2;
            } else if(i % 3 == 0) {
                c = num * 4;
            }
        }
        System.out.println(sb);
    }
}
