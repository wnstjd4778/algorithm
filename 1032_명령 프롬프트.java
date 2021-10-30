import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String val = br.readLine();
        for(int i = 0; i < n - 1; i++) {
            String str = br.readLine();
            String ans = "";
            for(int j = 0; j < str.length(); j++) {
                if(val.charAt(j) != str.charAt(j)) {
                    ans += "?";
                } else {
                    ans += val.charAt(j);
                }
            }
            val = ans;
        }
        System.out.println(val);
    }
}
