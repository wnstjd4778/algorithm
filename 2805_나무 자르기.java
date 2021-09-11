import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int result = Integer.parseInt(st.nextToken());
        int[] arr = new int[size];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = 0;
        while (min <= max) {
            int mid = (max + min) / 2;
            long count = 0;
            for(int i = 0; i < size; i++) {
                if(arr[i] > mid) {
                    count += (arr[i] - mid);
                }
            }
            //자른 나무 길이가 원하는 길이보다 크거나 같은 경우
            if(count >= result) {
                min = mid + 1;
            } 
            // 자른 나무 길이가 원하는 길이보다 작은 경우
            else {
                max = mid - 1;
            }
        }
        System.out.println(max);
    }
}
