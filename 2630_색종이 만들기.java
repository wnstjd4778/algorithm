import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[][] arr;
    public static int count0 = 0, count1 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        arr = new int[size][size];
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cut(0,0,size);
        System.out.println(count0);
        System.out.println(count1);

    }
    public static void cut(int row, int col, int size) {
        int count = 0;
        // row와 col에서 길이가 size인 정사가가형의 만들어 그 안에 arr값이 다 같은지 확인
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(arr[row][col] == arr[i][j]) {
                    count++;
                }
            }
        }
        if(count == size * size) {
            if(arr[row][col] == 1) {
                count1++;
            } else if(arr[row][col] == 0) {
                count0++;
            }
        } else {
            // 정사각형안에 arr값이 다르면 4등분을 해 재귀로 함수로 다시 호출
            cut(row,col,size / 2);
            cut(row, col + size / 2,size / 2);
            cut(row + size / 2,col,size / 2);
            cut(row + size / 2,col + size / 2,size / 2);
        }
    }
}
