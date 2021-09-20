import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] val = new String[n + 1];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            val[i] = br.readLine();
            map.put(val[i], i);
        }
        for(int i = 0; i < m; i++) {
            String a = br.readLine();
            Integer b = map.get(a);

            if(b == null) {
                System.out.println(val[Integer.parseInt(a)]);
            } else {
                System.out.println(b);
            }
        }
    }
}
