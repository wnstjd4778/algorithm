import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Comp> q = new PriorityQueue<>();
        for(int i = m; i <= n; i++) {
            String s = "";
            if(i < 10) {
                s = num[i];
            } else {
                s += num[i / 10];
                s += " ";
                s += num[i % 10];
            }
            q.offer(new Comp(s, i));
        }
        int cnt = 0;
        while (!q.isEmpty()) {
            Comp c = q.poll();
            cnt++;
            sb.append(c.n).append(' ');
            if(cnt % 10 == 0) {
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
    static class Comp implements Comparable<Comp> {
        String s;
        int n;
        public Comp(String s, int n) {
            this.s = s;
            this.n = n;
        }

        @Override
        public int compareTo(Comp o) {
            return s.compareTo(o.s);
        }
    }
}
