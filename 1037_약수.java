import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//모든 약수가 주어졌을 때 제일 작은 약수와 제일 큰 약수를 곱하면 n이 나온다.
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] val = new int[size];
        int max = 0;
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++) {
            val[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, val[i]);
            min = Math.min(min, val[i]);
        }
        System.out.println(max * min);
    }
}
