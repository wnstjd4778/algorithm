import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int[] cube = new int[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            cube[a] = b;
        }
        long before = 0;
        long ans = 0;
        for(int i = n - 1; i >= 0; i--) {
            before <<= 3;
            long possibleCube = (long) (length >> i) * (width >> i) * (height >> i) - before;
            long newCube = Math.min((long) cube[i], possibleCube);
            before += newCube;
            ans += newCube;
        }
        if(before == (long) length * width * height) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }
}

