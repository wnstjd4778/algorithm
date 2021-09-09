import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    deque.offer(Integer.valueOf(st.nextToken()));
                    break;
                case "pop":
                    Integer val1 = deque.poll();
                    if(val1 == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(val1).append('\n');
                    }
                    break;
                case "front":
                    Integer val = deque.peek();
                    if(val == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(val).append('\n');
                    }
                    break;
                case "back":
                    Integer val2 = deque.peekLast();
                    if(val2 == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(val2).append('\n');
                    }
                    break;
                case "empty":
                    if(deque.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
