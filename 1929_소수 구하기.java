import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 처음 일반적으로 소수를 구하게 풀었는데 시간초과가 나왔다. 그래서 소수를 찾는 알고리즘 중 시간 복잡도가 낮은 에라스토테네스의 체
// 알고리즘을 사용하였다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();
        StringTokenizer st = new StringTokenizer(value);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[b + 1];
        arr[1] = 1;
        for(int i = 2; i < b + 1; i++) {
            if(arr[i] == 0) {
                if((int)Math.pow(i,2) > 1000000) {
                    break;
                } else {
                    for(int j = (int)Math.pow(i,2); j < b+1; j+=i) {
                        arr[j] = 1;
                    }
                }
            }
        }
        for(int i = a; i < b + 1; i++) {
            if(arr[i] != 1) {
                System.out.println(i);
            }
        }
    }
}
