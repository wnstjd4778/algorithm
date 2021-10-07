import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val = br.readLine();
        boolean[] check = new boolean[501];
        for(int i = 0; i < val.length(); i++) {
            if(val.charAt(i) == '.') {
                check[i] = true;
            }
        }
        StringTokenizer st = new StringTokenizer(val, ".");
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            while (check[index]) {
                sb.append('.');
                index++;
            }
            if(index >= val.length()) {
                break;
            }
            String str = st.nextToken();
            if(str.length() % 2 == 0) {
                int num = str.length() / 4;
                for(int j = 0; j < num; j++) {
                    sb.append("AAAA");
                }
                if(str.length() % 4 == 2) {
                    sb.append("BB");
                }
                index += str.length();
            } else {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(sb);
    }
}


