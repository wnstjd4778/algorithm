import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(i % 10 == 0 && i != 0) {
                sb.append('\n');
            }
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
