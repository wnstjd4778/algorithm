import java.io.*;
import java.util.*;


public class Main {
    // 맵 내에 있는 물고기 클래스
    static class Fish {
        int row, col, size, eatCount, distance;
        public Fish(int row, int col, int size, int eatCount, int distance) {
            this.row = row;
            this.col = col;
            this.size = size;
            this.eatCount = eatCount;
            this.distance = distance;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        Fish shark = null;
        List<Fish> feeds = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num == 9) {
                    shark = new Fish(i, j, 2, 0, 0);
                    map[i][j] = 0;
                    continue;
                }
                if(num == 1) {
                    feeds.add(new Fish(i, j, 0, 0, 0));
                }
                map[i][j] = num;
            }
        }
        // 초기에 먹이가 없을 경우
        if(feeds.isEmpty()) {
            System.out.println(0);
            return;
        }

        int[] moveR = {-1, 1, 0, 0};
        int[] moveC = {0, 0, -1, 1};

        PriorityQueue<Fish> pq = new PriorityQueue<Fish>(new Comparator<Fish>() {
            @Override
            public int compare(Fish o1, Fish o2) {
                if(o1.distance == o2.distance) {
                    if(o1.row == o2.row) {
                        return o1.col - o2.col;
                    } else {
                        return o1.row - o2.row;
                    }
                } else {
                    return o1.distance - o2.distance;
                }
            }
        });

        Queue<Fish> q = new LinkedList<>();
        q.offer(shark);
        
        while (true) {
            boolean[][] chkMap = new boolean[n][n];
            chkMap[q.peek().row][q.peek().col] = true;
            while (!q.isEmpty()) {
                Fish fish = q.poll();
                int nowRow = fish.row;
                int nowCol = fish.col;

                for(int i = 0; i < 4; i++) {
                    int mr = nowRow + moveR[i];
                    int mc = nowCol + moveC[i];

                    if(mr < 0 || mr >= n || mc < 0 || mc >= n || map[mr][mc] > fish.size || chkMap[mr][mc]) {
                        continue;
                    }

                    if(map[mr][mc] < fish.size && map[mr][mc] != 0) {
                        pq.offer(new Fish(mr, mc, fish.size, fish.eatCount + 1, fish.distance + 1));
                    }

                    q.offer(new Fish(mr, mc, fish.size, fish.eatCount, fish.distance + 1));
                    chkMap[mr][mc] = true;
                }
            }
            // 더이상 먹이가 없을 경우
            if(pq.isEmpty()) {
                System.out.println(result);
                return;
            }

            Fish fish = pq.poll();
            if(fish.size == fish.eatCount) {
                fish.size++;
                fish.eatCount = 0;
            }
            map[fish.row][fish.col] = 0;
            result += fish.distance;
            q.offer(new Fish(fish.row, fish.col, fish.size, fish.eatCount, 0));
            pq.clear();
        }
    }

}
