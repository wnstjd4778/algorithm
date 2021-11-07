import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String lowStr = str.toLowerCase();
        String ans = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == lowStr.charAt(i)) {
                ans += (char)(ch - 32);
            } else {
                ans += lowStr.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
