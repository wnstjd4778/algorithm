import java.io.*;
import java.util.*;


public class Main {
    static int n, m;
    static int[] arr;
    static class Node{
        int end, depth;
        Node(int end, int depth) {
            this.end = end;
            this.depth = depth;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[100001];
        System.out.println(bfs());
    }
    public static int bfs() {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(n, 0));
        boolean[] check = new boolean[100001];
        check[n] = true;
        while (!q.isEmpty()) {
            Node num = q.poll();
            if(num.end == m) {
                return num.depth;
            }
            int num1 = num.end + 1;
            int num2 = num.end - 1;
            int num3 = num.end * 2;
            if(num3 <= 100000 && !check[num3]) {
                if(num3 == m) {
                    return num.depth;
                }
                q.offer(new Node(num3, num.depth));
                check[num3] = true;
            }
            if(num2 >= 0 && !check[num2]) {
                if(num2 == m) {
                    return num.depth + 1;
                }
                q.offer(new Node(num2, num.depth + 1));
                check[num2] = true;
            }

            if(num1 <= 100000 && !check[num1]) {
                if(num1 == m) {
                    return num.depth + 1;
                }
                q.offer(new Node(num1, num.depth + 1));
                check[num1] = true;
            }


        }
        return -1;
    }
}
