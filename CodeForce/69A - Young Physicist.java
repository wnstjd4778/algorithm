import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine().trim());
       int[][] arr = new int[n][3];
       for(int i = 0; i < n; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           for(int j = 0; j < 3; j++) {
               arr[i][j] = Integer.parseInt(st.nextToken());
           }
       }

       for(int i = 0; i < 3; i++) {
           int sum = 0;
           for(int j = 0; j < n; j++) {
               sum += arr[j][i];
           }
           if(sum != 0) {
               System.out.println("NO");
               return;
           }
       }
        System.out.println("YES");
    }
}
