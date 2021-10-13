import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            Deque<Integer> dq = new ArrayDeque<>();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = st.nextToken().charAt(0);
            dq.add(index);
            for(int i = 0; i < n - 1; i++) {
                int num = st.nextToken().charAt(0);
                if(index < num) {
                    dq.addLast(num);
                } else {
                    dq.addFirst(num);
                    index = num;
                }
            }
            for(int val : dq) {
                sb.append((char) val);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
