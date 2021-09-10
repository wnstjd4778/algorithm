import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[][] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        arr = new int[size][size];
        for(int i = 0; i < size; i++) {
            String val = br.readLine();
            for(int j = 0; j < size; j++) {
                // char에서 int로 변환
                arr[i][j] = val.charAt(j) - '0';
            }
        }
        cut(0, 0, size);
        System.out.println(sb);
    }
    public static void cut(int row, int col, int size) {
        int count = 0;
        // (row,col)점에서 길이가 size인 정사각형을 만들어 그 안에 arr가 같은지 확인
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(arr[row][col] == arr[i][j]) {
                    count++;
                }
            }
        }
        if(count == size * size) {
            sb.append(arr[row][col]);
        } else {
            sb.append('(');
            cut(row, col, size / 2);
            cut(row, col + size / 2, size / 2);
            cut(row + size / 2, col, size / 2);
            cut(row + size / 2, col + size / 2, size / 2);
            sb.append(')');
        }
    }
}
