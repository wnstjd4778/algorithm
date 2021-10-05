import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int ans = 0;
        for(int i = 0; i < str1.length(); i++) {
            int count = 0;
            for(int j = 0; j < str2.length(); j++) {
                if((i + j) < str1.length() && str1.charAt(i + j) == str2.charAt(j)) {
                    count++;
                } else {
                    break;
                }
                if(count == str2.length()) {
                    ans++;
                    i += j;
                }
            }
        }
        System.out.println(ans);
    }
}


