import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j] = ' ';
            }
        }
        star(0,0,n);
        StringBuilder sb = new StringBuilder(); // 시간 초과가 나와 StringBuilder로 출력하였다.
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void star(int row, int col, int num) {
        if(num == 1) { // arr배열에 *을 찍어주는 역할
            arr[row][col] = '*';
            return;
        }

        int val = num/3;
        for (int i = 0; i <3 ; i++) { 
            for (int j = 0; j <3 ; j++) {
                if(i==1 && j==1){
                }else{
                    star(row+(val*i), col+(val*j), val);
                }
            }
        }
    }
}
