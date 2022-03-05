import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
// 조건
// x를 1부터 x까지 나눈다. 나누어 떨어지면 값을 1추가한다.
// x를 나누었을 때 몫이 n보다 크면 더하지 않는다.
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong((st.nextToken()));
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if(x % i == 0 && x / i <= n) {
                result++;
            }
        }
        System.out.println(result);
    }
}