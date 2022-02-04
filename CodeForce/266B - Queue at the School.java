import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());
       char[] arr = br.readLine().toCharArray();
       for(int i = 0; i < m; i++) {
           for(int j = 0; j < n - 1; j++) {
               if(arr[j] == 'B' && arr[j + 1] == 'G') {
                   char temp = arr[j + 1];
                   arr[j + 1] = arr[j];
                   arr[j] = temp;
                   j++;
               }
           }
       }
       for(int i = 0; i < n; i++) {
           System.out.print(arr[i]);
       }
    }
}
