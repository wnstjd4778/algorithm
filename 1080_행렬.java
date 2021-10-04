import java.io.*;
import java.util.*;


public class Main {
    static int[][] arr1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                arr1[i][j] = str.charAt(j) - '0';
            }
        }
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                arr2[i][j] = str.charAt(j) - '0';
            }
        }
        int count = 0;
        for(int i = 0; i < n - 2; i++) {
            for(int j = 0; j < m - 2; j++) {
                if(arr1[i][j] != arr2[i][j]) {
                    count++;
                    change(i, j);
                }
            }
        }
        boolean flag = false;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr1[i][j] != arr2[i][j]) {
                    System.out.println(-1);
                    flag = true;
                    break;
                }
            }
            if(flag) {
                break;
            }
        }
        if(!flag) {
            System.out.println(count);
        }
    }
    public static void change(int x, int y) {
        for(int i = x; i <= x + 2; i++) {
            for(int j = y; j <= y + 2; j++) {
                arr1[i][j] = 1 - arr1[i][j];
            }
        }
    }
}


