import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제 이해하는 데 조금 어려웠다... 해당 번째에 선물을 준 사람으로 입력으로 들어오고 출력으로 몇번째 사람에게
// 선물을 주었는지 출력하는 것이다.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[105];
        StringTokenizer st = new StringTokenizer(br.readLine());


        for(int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[num] = i;
        }
        for(int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
