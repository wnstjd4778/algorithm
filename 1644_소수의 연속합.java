import java.io.*;
import java.util.*;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[4000001];
        arr[0] = arr[1] = 1;
        // 에라토스테네스의 체 사용해서 소수를 구함
        for(int i = 2; i <= Math.sqrt(n); i++) {
            for(int j = i*i; j <= n; j += i) {
                arr[j] = 1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            if(arr[i] == 0) {
                list.add(i);
            }
        }
        solution(n, list);
        System.out.println(count);
    }
    public static void solution(int n, List<Integer> list) {
        int start = 0;
        int end = 0;
        int sum = 0;
        while (true) {
            if(sum == n) {
                count++;
            }
            if(end >= list.size()) {
                break;
            }
            if(sum < n && start < list.size()) {
                sum += list.get(start++);
            } else {
                sum -= list.get(end++);
            }
        }
    }
}
