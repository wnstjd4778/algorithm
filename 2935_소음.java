import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        char ch = br.readLine().charAt(0);
        String str3 = br.readLine();
        int n = str1.length() - 1;
        int m = str3.length() - 1;
        String ans = "";
        if(ch == '*') {
            ans += '1';
            for(int i = 0; i < n + m; i++) {
                ans += '0';
            }
        } else {
            boolean flag = false;
            boolean flag1 = false;
            if(n == m) {
                flag1 = true;
            }
            for(int i = 101; i > 0; i--) {
                if(i == n + 1 || i == m + 1) {
                    if(flag1) {
                        ans += '2';
                    } else {
                        ans += '1';
                    }
                    flag = true;
                    continue;
                }
                if(flag) {
                    ans += '0';
                }
            }
        }
        System.out.println(ans);
    }
}
