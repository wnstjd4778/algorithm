import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            System.out.print("Distances: ");
            for(int i = 0; i < str1.length(); i++) {
                int n = str1.charAt(i);
                int m = str2.charAt(i);
                int num = m - n;
                if(num < 0) {
                    num += 26;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
