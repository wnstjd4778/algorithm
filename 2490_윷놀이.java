import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = 3;
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count0 = 0;
            int count1 = 1;
            for(int i = 0; i < 4; i++) {
                int num = Integer.parseInt(st.nextToken());
                if(num == 0) {
                    count0++;
                } else {
                    count1++;
                }
            }
            if(count0 == 0) {
                System.out.println("E");
            } else if(count0 == 1) {
                System.out.println("A");
            } else if(count0 == 2) {
                System.out.println("B");
            } else if(count0 == 3) {
                System.out.println("C");
            } else if(count0 == 4) {
                System.out.println("D");
            }
        }
    }
}
