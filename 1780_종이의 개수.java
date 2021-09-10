import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;
    public static int count1, count2, count3;
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
        cut(0, 0, size);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
    public static void cut(int row, int col, int size) {
        int count = 0;
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(arr[row][col] == arr[i][j]) {
                    count++;
                }
            }
        }

        if(count == size * size) {
            if(arr[row][col] == -1) {
                count1++;
            } else if(arr[row][col] == 0) {
                count2++;
            } else {
                count3++;
            }
        } else {
            size = size / 3;
            cut(row, col, size);
            cut(row, col + size, size);
            cut(row, col + size * 2, size);
            cut(row + size, col, size);
            cut(row + size, col + size, size);
            cut(row + size, col + size * 2, size);
            cut(row + size * 2, col, size);
            cut(row + size * 2, col + size, size);
            cut(row + size * 2, col + size * 2, size);

        }
    }
}
