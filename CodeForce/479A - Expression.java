import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int max = 0;
        for(int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }
        max = Math.max(max, arr[0] + arr[1] + arr[2]);
        max = Math.max(max, arr[0] * (arr[1] + arr[2]));
        max = Math.max(max, (arr[0] + arr[1]) * arr[2]);
        max = Math.max(max, arr[0] * arr[1] * arr[2]);
        System.out.println(max);
    }
}
