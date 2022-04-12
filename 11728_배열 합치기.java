import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (n > i && m > j) {
            if(arr1[i] > arr2[j]) {
                result[k++] = arr2[j++];
            } else {
                result[k++] = arr1[i++];
            }
        }

        while (j < m) {
            result[k++] = arr2[j++];
        }
        while (i < n) {
            result[k++] = arr1[i++];
        }

        for(int a : result) {
            sb.append(a).append(" ");
        }
        System.out.println(sb);
    }
}
