import java.io.*;
import java.util.*;


public class Main {

    static int count;
    static int n, r, c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        solution(0, 0, (int) Math.pow(2, n));
    }
    public static void solution(int x, int y, int size) {
        if(size == 1) {
            System.out.println(count);
            return;
        }
        if(r < x + size / 2 && c < y + size / 2) {
            solution(x, y, size / 2);
        }
        if(r < x + size / 2 && y + size / 2 <= c) {
            count += (size * size) / 4;
            solution(x, y + size / 2, size / 2);
        }
        if(x + size / 2 <= r && c < y + size / 2) {
            count += ((size * size) / 4) * 2;
            solution(x + size / 2, y, size / 2);
        }
        if(x + size / 2 <= r && y + size / 2 <= c) {
            count += ((size * size) / 4) * 3;
            solution(size / 2 + x, y + size / 2, size / 2);
        }
    }
}
