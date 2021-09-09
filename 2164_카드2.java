import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();
        for(int i = 1; i < n + 1; i++) {
            q.offer(i);
        }
        for(int i = 0; i < n - 1; i++) {
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.peek());
    }
}
