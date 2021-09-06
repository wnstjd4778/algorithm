import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 백트래킹의 대표 문제이다.
public class Main{

    public static int[] arr;
    public static int val;
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        val = Integer.parseInt(br.readLine());
        arr = new int[val];
        dfs(0);
        System.out.println(count);
    }

    public static void dfs(int depth) {
        if(val == depth) {
            count++;
            return;
        }
        for(int i = 0; i < val; i++) {
            arr[depth] = i;

            if(Possibility(depth)) {
                dfs(depth+1); // 재귀
            }
        }
    }

    public static boolean Possibility(int col) {
        for(int i = 0; i < col; i++) {
            if(arr[col] == arr[i]) { // 같은 행에 있는 경우
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) { // 열의 차와 행의 차가 같은면 대각선
                                                                            // 대각선에 있는 경우
                return false;
            }
        }
        return true;
    }
}
