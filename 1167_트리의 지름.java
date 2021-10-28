import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Node>[] tree;
    static boolean[] visit;
    static int max = 0;
    static int maxIdx;

    static class Node{
        int num, cost;
        Node(int num, int cost) {
            this.num = num;
            this.cost = cost;
        }
    }

    static void dfs(int idx, int cost) {
        if(cost > max) {
            max = cost;
            maxIdx = idx;
        }

        visit[idx] = true;
        for(Node n : tree[idx]) {
            if(!visit[n.num]) {
                visit[n.num] = true;
                dfs(n.num, cost + n.cost);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new ArrayList[n + 1];
        for(int i = 0; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        for(int i = 0; i < n; i++) {
            int node = sc.nextInt();

            while (true) {
                int child = sc.nextInt();
                if(child == - 1) {
                    break;
                }
                int cost = sc.nextInt();
                tree[node].add(new Node(child, cost));
            }
        }
        visit = new boolean[n + 1];
        dfs(1, 0);
        visit = new boolean[n + 1];
        dfs(maxIdx, 0);

        System.out.println(max);
    }
}
