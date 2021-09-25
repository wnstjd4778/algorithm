import java.io.*;
import java.util.*;


public class Main {

    static int n, m;
    static int[][] map;
    static boolean[][] check;
    static ArrayList<Point> cheeseList;
    static int cheeseCnt = 0;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static class Point {
        int x, y;
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
        map = new int[n][m];
        cheeseList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1) {
                    cheeseList.add(new Point(i, j));
                    cheeseCnt += 1;
                }
            }
        }

        int time = 0;
        while (cheeseCnt != 0) {
            time++;
            check = new boolean[n][m];
            dfs(0, 0);
            melting();
        }
        System.out.println(time);
    }

    public static void dfs(int x, int y) {
        check[x][y] = true;
        map[x][y] = 2;
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
                continue;
            }
            if(check[nx][ny] || map[nx][ny] == 1) {
                continue;
            }
            dfs(nx, ny);
        }
    }

    public static void melting() {
        for(int i = 0; i < cheeseList.size(); i++) {
            int x = cheeseList.get(i).x;
            int y = cheeseList.get(i).y;
            int cnt = 0;

            for(int j = 0; j < 4; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];

                if(map[nx][ny] == 2) {
                    cnt++;
                }
            }

            if(cnt >= 2) {
                map[x][y] = 0;
                cheeseCnt--;
                cheeseList.remove(i);
                i--;
            }
        }
    }
}
