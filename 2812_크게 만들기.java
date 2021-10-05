import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String input = br.readLine();
        char[] arr = input.toCharArray();
        Deque<Character> dq = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++) {
            while (m > 0 && !dq.isEmpty() && dq.getLast() < arr[i]) {
                dq.removeLast();
                m--;
            }
            dq.addLast(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        while (dq.size() > m) {
            sb.append(dq.removeFirst());
        }
        System.out.println(sb);
    }
}


