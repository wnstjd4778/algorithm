import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int ans = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                flag2 = false;
                if(flag1) {
                    ans += 5;
                    continue;
                }
                ans += 10;
                flag1 = true;
            } else {
                flag1 = false;
                if(flag2) {
                    ans += 5;
                    continue;
                }
                ans += 10;
                flag2 = true;
            }
        }
        System.out.println(ans);
    }
}
