import java.io.*;
import java.util.*;


public class Main {
    static int[] arr;
    static int[] result;
    static boolean[] check;
    static int[] result1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[9];
        result = new int[7];
        result1 = new int[7];
        check = new boolean[9];

        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dfs(0);
        Arrays.sort(result1);
        for(int i = 0; i < 7; i++) {
            System.out.println(result1[i]);
        }
    }

    public static void dfs(int depth) {
        if(depth == 7) {
            int sum = 0;
            for(int i = 0; i < 7; i++) {
                sum+=result[i];
            }
            if(sum == 100) {
                for (int i = 0; i < 7; i++) {
                    result1[i] = result[i];
                }
                return;
            }
        }
        if(depth == 7) {
            return;
        }
        for(int i = 0; i < 9; i++) {
            if(check[i] == false) {
                check[i] = true;
                result[depth] = arr[i];
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }
}
