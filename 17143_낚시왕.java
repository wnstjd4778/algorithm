import java.io.*;
import java.util.*;


public class Main {
    static int r, c, m, fisherman, ans;
    static Queue<Shark> q = new LinkedList<>();
    static Queue<Shark> afterQ;
    static int[][] map;
    static int[][] afterMap;
    static int[] dx = {0, -1, 1, 0, 0};
    static int[] dy = {0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[r + 1][c + 1];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            q.offer(new Shark(a, b, c, d, f));
            map[a][b] = f;
        }
        run();
        System.out.println(ans);

    }

    public static void run() {
        while(fisherman < c) {
            fisherman++;
            boolean isCatch = false;
            for (int i = 0; i <= r; i++) {
                if (map[i][fisherman] > 0) {
                    while (true) {
                        Shark s = q.poll();
                        if (i == s.r && fisherman == s.c) {
                            isCatch = true;
                            ans += map[i][fisherman];
                            break;
                        }
                        q.offer(s);
                    }
                }
                if (isCatch) {
                    break;
                }
            }

            afterMap = new int[r + 1][c + 1];
            afterQ = new LinkedList<>();
            while (!q.isEmpty()) {
                Shark s = q.poll();
                int speed = s.s;
                int dir = s.d;
                int size = s.z;
                int nx = s.r;
                int ny = s.c;
                while (speed > 0) {
                    nx += dx[dir];
                    ny += dy[dir];
                    if (nx < 1 || nx > r || ny < 1 || ny > c) {
                        nx -= dx[dir];
                        ny -= dy[dir];

                        if (dir == 1) dir = 2;
                        else if (dir == 2) dir = 1;
                        else if (dir == 3) dir = 4;
                        else if (dir == 4) dir = 3;

                        continue;
                    }
                    speed--;
                }
                if (afterMap[nx][ny] > 0) {
                    if (afterMap[nx][ny] < size) {
                        while (!afterQ.isEmpty()) {
                            Shark sk = afterQ.poll();
                            if (sk.r == nx && sk.c == ny) {
                                afterMap[nx][ny] = size;
                                break;
                            }
                            afterQ.offer(sk);
                        }
                        afterQ.offer(new Shark(nx, ny, s.s, dir, size));
                    }
                } else {
                    afterQ.offer(new Shark(nx, ny, s.s, dir, size));
                    afterMap[nx][ny] = size;
                }
            }
            q = afterQ;
            map = afterMap;
        }
    }
    public static class Shark {
        int r, c, s, d, z;
        Shark(int r, int c, int s, int d, int z) {
            this.r = r;
            this.c = c;
            this.s = s;
            this.d = d;
            this.z = z;
        }
    }
}
