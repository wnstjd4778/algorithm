import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean isFinished;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[9][9];
        for(int i = 0; i < 9; i++) {
            String str = br.readLine();
            for(int j = 0; j < 9; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        solution(0, 0);
    }

    static void solution(int r, int c) {
        int nr = r, nc = c + 1;
        if(nc == 9) {
            nr++;
            nc = 0;
        }
        if(r == 9) {
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
            System.exit(0);
        }
        if(map[r][c] != 0) {
            solution(nr, nc);
        } else {
            for(int i = 1; i <= 9; i++) {
                if(check(r, c, i)) {
                    map[r][c] = i;
                    solution(nr, nc);
                    map[r][c] = 0;
                }
            }
        }
    }
    static boolean check(int r, int c, int n) {
        boolean flag = true;
        for(int i = 0; i < 9; i++) {
            if(map[r][i] == n) {
                flag = false;
                break;
            }
        }
        for(int i = 0; i < 9; i++) {
            if(map[i][c] == n) {
                flag = false;
                break;
            }
        }

        for(int i = r / 3 * 3; i < r / 3 * 3 + 3; i++) {
            for(int j = c / 3 * 3; j < c / 3 * 3 + 3; j++) {
                if(map[i][j] == n) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
