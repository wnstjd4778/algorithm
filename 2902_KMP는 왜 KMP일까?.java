import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(flag || i == 0) {
                sb.append(str.charAt(i));
                flag = false;
            }
            if(str.charAt(i) == '-') {
                flag = true;
            }
        }
        System.out.println(sb);
    }
}
