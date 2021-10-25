import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(arr, n));
    }

    private static int solve(int[] weight, int n) {
        Arrays.sort(weight);
        if (weight[0] != 1) return 1;

        int sum = weight[0];

        for (int i = 1; i < n; i++) {
            if (weight[i] > sum + 1) return sum + 1;
            sum += weight[i];
        }
        return sum + 1;
    }

}

