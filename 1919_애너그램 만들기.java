import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        boolean[] check = new boolean[str2.length()];
        int count = 0;
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            boolean flag = false;
            for(int j = 0; j < str2.length(); j++) {
                if(ch == str2.charAt(j) && !check[j]) {
                    flag = true;
                    check[j] = true;
                    break;
                }
            }
            if(flag) {
                count++;
            }
        }
        System.out.println(str1.length() - count + str2.length() - count);
    }
}
