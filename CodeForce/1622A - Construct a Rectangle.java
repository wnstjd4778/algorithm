import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            int max = 0; // 최댓값
            int maxIndex = -1; // 최댓값 인덱스
            for(int j = 0; j < 3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                if(max < arr[j]) {
                    maxIndex = j;
                    max = arr[j];
                }
            }

            // 세 수가 같을 때 짝수이면 만들 수 있고 홀수이면 못 만듬
            if(arr[0] == arr[1] && arr[1] == arr[2]) {
                if(arr[0] % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }

            // 두 수가 같을 때 나머지 한 수가 짝수이면 만들고 홀수이면 못만듬
            if(arr[0] == arr[1]) {
                if(arr[2] % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            } else if(arr[1] == arr[2]) {
                if(arr[0] % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            } else if(arr[0] == arr[2]) {
                if(arr[1] % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }

            // 작은 수 두개로 큰 수를 만들 수 있으면 만들 수 있고 아니면 못만듬
            int sum = 0;
            for(int j = 0; j < 3; j++) {
                if(maxIndex != j) {
                    sum += arr[j];
                }
            }
            if(max == sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
