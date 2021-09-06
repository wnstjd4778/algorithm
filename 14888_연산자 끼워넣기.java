import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static int[] num;
    public static int[] a = new int[4];
    public static int val;
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        val = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br. readLine());
        num = new int[val];
        for(int i = 0; i < val; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br. readLine());
        for(int i = 0; i < 4; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        dfs(num[0],0);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int result, int depth) {
        if(depth == val - 1) {
            max = Math.max(result, max);
            min = Math.min(min, result);
            return;
        }
        for(int i = 0; i < 4; i++) { // a배열에 연산횟수를 넣은 후 한개씩 꺼내 계산을 적용한 후 재귀로 품
            if(a[i] > 0) {
                a[i]--;
                int val = cal(result, num[depth + 1], i);
                dfs(val, depth + 1);
                a[i]++;
             }
         }
    }
    public static int cal(int x, int y, int i) { // i값에 따라 계산 적용
        if(i == 0) {
            return x + y;
        } else if(i == 1) {
            return x - y;
        } else  if(i == 2) {
            return x * y;
        } else{
            return x / y;
        }
    }
}
