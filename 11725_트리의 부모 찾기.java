import java.io.*;
import java.util.*;

public class Main {

    static List<List<Integer>> tree = new ArrayList<>();
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        parent = new int[n + 1];
        for(int i = 0; i <=n; i++) {
            tree.add(new ArrayList<>());
        }

        while (n-- > 1) {
            String[] s = br.readLine().split(" ");
            int from = Integer.parseInt(s[0]);
            int to = Integer.parseInt(s[1]);

            tree.get(from).add(to);
            tree.get(to).add(from);
        }
        dfs(1);
        for(int i = 2; i < parent.length; i++) {
            System.out.println(parent[i]);
        }
    }

    static void dfs(int start) {
        for(int val : tree.get(start)) {
            if(parent[val] == 0) {
                parent[val] = start;
                dfs(val);
            }
        }
    }
}
