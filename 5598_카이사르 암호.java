import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String ans = "";
        for(int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            num -= 3;
            if(num < 0) {
                num += 26;
            }
            ans += (char)(num + 'A');
        }
        System.out.println(ans);
    }
}
