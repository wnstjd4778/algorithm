import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[num]++;
        }
        int result = arr[4] + arr[3];
        arr[1] -= arr[3];

        if(arr[2] % 2 == 0) {
            result += arr[2] / 2;
        } else {
            result += (arr[2] / 2 + 1);
            arr[1] -= 2;
        }

        if(arr[1] > 0) {
            result += arr[1] / 4;
            if(arr[1] % 4 != 0) {
                result++;
            }
        }

        System.out.println(result);
    }
}
