import java.io.*;
import java.util.*;


public class Main {
    static String n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = br.readLine();
        m = br.readLine();
        for(int i = m.length() - 1; i >= 0; i--) {
            String str = "";
            if(m.charAt(i) == 'A') {
                for(int j = 0; j < m.length() - 1; j++) {
                    str += m.charAt(j);
                }
                m = str;
            } else {
                for(int j = m.length() - 2; j >= 0; j--) {
                    str += m.charAt(j);
                }
                m = str;
            }
            if(m.equals(n)) {
                System.out.println(1);
                return;
            } else if(m.length() == n.length()) {
                System.out.println(0);
                return;
            }
        }
    }
}


