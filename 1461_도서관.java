import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> high = new PriorityQueue<>((x, y) -> y - x);
        PriorityQueue<Integer> low = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num > 0) {
                high.add(num);
            } else if(num < 0) {
                low.add(num);
            }
        }
        int element;
        int count = 0;
        int max = 0;
        while (!high.isEmpty()) {
            for(int i = 0; i < m; i++) {
                if(high.isEmpty()) {
                    continue;
                }
                element = high.poll();
                if(i == 0) {
                    count += Math.abs(element);
                    if(Math.abs(element) > max) {
                        max = Math.abs(element);
                    }
                }
            }
        }
        while (!low.isEmpty()) {
            for(int i = 0; i < m; i++) {
                if(low.isEmpty()) {
                    continue;
                }
                element = low.poll();
                if(i == 0) {
                    count += Math.abs(element);
                    if(Math.abs(element) > max) {
                        max = Math.abs(element);
                    }
                }
            }
        }
        System.out.println(count * 2 - max);
    }
}



