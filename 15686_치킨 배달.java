import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] map;
    static ArrayList<Point> person;
    static ArrayList<Point> chicken;
    static int ans;
    static boolean[] open;

    static class Point{
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        person = new ArrayList<>();
        chicken = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if(map[i][j] == 1) {
                    person.add(new Point(i, j));
                } else if(map[i][j] == 2) {
                    chicken.add(new Point(i, j));
                }
            }
        }
        ans = Integer.MAX_VALUE;
        open = new boolean[chicken.size()];
        dfs(0, 0);
        System.out.println(ans);
    }

    static void dfs(int start, int depth) {
        if(depth == m) {
            int sum = 0;
            for(int i = 0; i < person.size(); i++) {
                int temp = Integer.MAX_VALUE;
                for(int j = 0; j < chicken.size(); j++) {
                    if(open[j]) {
                        int dist = Math.abs(person.get(i).x - chicken.get(j).x) +
                                Math.abs(person.get(i).y - chicken.get(j).y);
                        temp = Math.min(temp, dist);
                    }
                }
                sum += temp;
            }
            ans = Math.min(ans, sum);
            return;
        }

        for(int i = start; i < chicken.size(); i++) {
            open[i] = true;
            dfs(i + 1, depth + 1);
            open[i] = false;
        }
    }
}
