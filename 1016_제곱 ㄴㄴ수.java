import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();
        StringTokenizer st = new StringTokenizer(value);
        long a = Long.valueOf(st.nextToken());
        long b = Long.valueOf(st.nextToken());
        long[] checks = new long[1000001];
        int count = 0;
        long init = a;
        for(int i = 0; i < checks.length; i++) {
            checks[i] = init++;
            if(init == b+1) {
                break;
            }
        }
        for(long i = 2; i <= 1000000; i++) {
            long squareNumber = i*i;
            if(squareNumber > b) {
                break;
            } else {
              // 시간복잡도 때문에 처음으로 제곱수가 나오는 배열 인덱스 구하기
                long quot = (a / squareNumber);
                if(quot * squareNumber < a) {
                    quot++;
                }
                long j = (quot * squareNumber) - a;
              // 에라스토테네스의 체 알고리즘
                for(long k = j; k < checks.length; k += squareNumber) {
                    checks[(int)k] = 0;
                }
            }
        }
        for(int i = 0; i < checks.length; i++) {
            if(checks[i] != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
