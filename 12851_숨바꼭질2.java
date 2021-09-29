import java.io.*;
import java.util.*;


public class Main {
    static int n, m, count, min;
    static int depthCount = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        count = 1;
        if(n > m) {
            System.out.println(n - m);
            System.out.println(1);
        } else {
            bfs();
            System.out.println(depthCount);
            System.out.println(count);
        }
    }

    public static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(n, 0));
        boolean[] check = new boolean[100001];
        check[n] = true;
        while (!queue.isEmpty()) {
            Node num = queue.poll();
            check[num.end] = true;
            if(num.end == m) {
                if(depthCount > num.depth) {
                    depthCount = num.depth;
                }
                else if(depthCount == num.depth) {
                    count++;
                }
                continue;
            }
            int num1 = num.end + 1;
            int num2 = num.end - 1;
            int num3 = num.end * 2;
            if (num1 <= 100000 && !check[num1]) {
                queue.offer(new Node(num1, num.depth + 1));
            }
            if (num2 > 0 && !check[num2]) {
                queue.offer(new Node(num2, num.depth + 1));
            }
            if (num3 <= 100000 && !check[num3]) {
                queue.offer(new Node(num3, num.depth + 1));
            }
        }
    }
    public static class Node {
        int end, depth;
        Node(int end, int depth) {
            this.end = end;
            this.depth = depth;
        }
    }
}
