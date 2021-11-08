import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = "CAMBRIDGE";
        String str = br.readLine();
        String ans = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean flag = true;
            for(int j = 0; j < a.length(); j++) {
                if(ch == a.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                ans += ch;
            }
        }
        System.out.println(ans);
    }
}
