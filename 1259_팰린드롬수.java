import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] val = br.readLine().split("");
        while (!val[0].equals("0")) {
            int flag = 0;
            for (int i = 0; i < val.length / 2; i++) {
                if (val[i].equals(val[val.length - 1 - i])) {
                    flag += 1;
                } else flag = 0;
            }
            if (flag == val.length / 2) sb.append("yes");
            else sb.append("no");

            val = br.readLine().split("");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
