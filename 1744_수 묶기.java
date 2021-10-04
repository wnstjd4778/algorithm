import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        PriorityQueue<Integer> q2 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        boolean checkZero = false;
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > 0) {
                q1.offer(num);
            } else if(num < 0) {
                q2.offer(num);
            } else {
                checkZero = true;
            }
        }
        int res = 0;
        if(q1.size() % 2 == 1) {
            res += q1.poll();
        }
        if(q2.size() % 2 == 1) {
            if(!checkZero) {
                res += q2.poll();
            } else {
                q2.poll();
            }
        }
        while (!q1.isEmpty()) {
            int a = q1.poll();
            int b = q1.poll();
            if(a == 1) {
                res += (a + b);
            } else {
                res += (a * b);
            }

        }
        while (!q2.isEmpty()) {
            int a = q2.poll();
            int b = q2.poll();
            res += (a * b);
        }
        System.out.println(res);
    }
}


