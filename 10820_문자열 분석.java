import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                for(char c = 'a'; c <= 'z'; c++) {
                    if(ch == c) {
                        count1++;
                    }
                }
                for(char c = 'A'; c <= 'Z'; c++) {
                    if(ch == c) {
                        count2++;
                    }
                }
                for(int j = 0; j < 10; j++) {
                    if(ch - '0' == j) {
                        count3++;
                    }
                }
                if(ch == ' ') {
                    count4++;
                }
            }
            System.out.print(count1 + " ");
            System.out.print(count2 + " ");
            System.out.print(count3 + " ");
            System.out.println(count4);
        }
    }
}
