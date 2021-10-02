import java.io.*;
import java.util.*;


public class Main {
    static int[] parent;
    static int[] cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int f = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            parent = new int[f * 2];
            cnt = new int[f * 2];
            Arrays.fill(cnt, 1);
            int idx = 0;
            for(int j = 0; j < f; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String val1 = st.nextToken();
                String val2 = st.nextToken();
                if(!map.containsKey(val1)) {
                    parent[idx] = idx;
                    map.put(val1, idx++);
                }
                if(!map.containsKey(val2)) {
                    parent[idx] = idx;
                    map.put(val2, idx++);
                }
                union(map.get(val1), map.get(val2));

                System.out.println(cnt[find(map.get(val2))]);
            }
        }
    }
    static void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if(parentA == parentB) return;
        parent[parentB] = parentA;
        cnt[parentA] += cnt[parentB];
    }

    static int find(int a) {
        if(parent[a] == a) return a;
        return parent[a] = find(parent[a]);
    }
}

