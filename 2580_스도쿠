import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static int[][] arr = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i =  0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0);
    }

    public static void dfs(int row, int col) {
        if(col == 9) {
            dfs(row + 1, 0);
            return;
        }
        if(row == 9) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);
        }
        if(arr[row][col] == 0) {
            for(int i = 1; i <= 9; i++) {
                if(check(row, col, i)) {
                    arr[row][col] = i;
                    dfs(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }
        dfs(row, col + 1);
    }

    public static boolean check(int row, int col, int value) {
        for(int i = 0; i < 9; i++) { // 같은 행에 같은 숫자가 있는지 확인
            if(arr[row][i] == value) {
                return false;
            }
        }
        for(int i = 0; i < 9; i++) { // 같은 열에 같은 숫자가 있는지 확인
            if(arr[i][col] == value) {
                return false;
            }
        }

        int setRow = (row / 3) * 3;
        int setCol = (col / 3) * 3;
        for(int i = setRow; i < setRow + 3; i++) { // 3*3 안에 같은 숫자가 있는 지 확인
            for(int j = setCol; j < setCol + 3; j++) {
                if(arr[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
