import java.io.*;
import java.util.*;


public class Main {
    static ArrayList<Integer>[] graph;
    static int[] root;
    static int N, M, K, X;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken()) - 1;

        graph = new ArrayList[N];
        root = new int[N];

        for(int i=0;i<N;i++)
            graph[i] = new ArrayList<Integer>();

        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            graph[a].add(b);
        }

        BFS(X);

        boolean check = false;
        for(int i=0;i<N;i++)
            if(root[i] == K && X != i) {
                System.out.println(i + 1);
                check = true;
            }
        if(check == false)
            System.out.print(-1);
    }
    static void BFS(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        root[start] = 0;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(int i : graph[tmp])
                if(root[i] == 0) {
                    q.add(i);
                    root[i] = root[tmp] + 1;
                }
        }
    }
}
