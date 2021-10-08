import java.io.*;
import java.util.*;


public class Main {
    static class Delivery implements Comparable<Delivery> {
        int start, end, boxNum;

        Delivery(int start, int end, int boxNum) {
            this.start = start;
            this.end = end;
            this.boxNum = boxNum;
        }

        @Override
        public int compareTo(Delivery o) {
            if (end == o.end) {
                return start - o.start;
            }
            return end - o.end;
        }
    }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st= new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(br.readLine());
            Delivery[] deliveries = new Delivery[m + 1];
            for(int i = 1; i <= m; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int boxNum = Integer.parseInt(st.nextToken());
                deliveries[i] = new Delivery(start, end, boxNum);
            }
            Arrays.sort(deliveries, 1, m + 1);
            int[] weight = new int[n + 1];
            for(int i = 1; i <= n; i++) {
                weight[i] = c;
            }
            int ans = 0;
            for(int i = 1; i <= m; i++) {
                Delivery d = deliveries[i];
                int maxBoxNum = Integer.MAX_VALUE;
                for(int j = d.start; j < d.end; j++) {
                    maxBoxNum = Math.min(maxBoxNum, weight[j]);
                }
                if(maxBoxNum >= d.boxNum) {
                    for(int j = d.start; j < d.end; j++) {
                        weight[j] -= d.boxNum;
                    }
                    ans += d.boxNum;
                } else {
                    for(int j = d.start; j < d.end; j++) {
                        weight[j] -= maxBoxNum;
                    }
                    ans += maxBoxNum;
                }
            }
            System.out.println(ans);
        }
    }


