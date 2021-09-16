import java.io.*;
import java.util.*;

public class Main {
    static int n, c;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        dfs(0, n / 2, 0, left);
        dfs(n / 2 + 1, n - 1, 0, right);
        Collections.sort(left);
        Collections.sort(right);
        int result = 0;
        int e = right.size() - 1;
        // meet in the middle 알고리즘 : 2의 n승인 시간을 2 * 2의 n/2승을 만들어줌
        for(int i = 0; i < left.size(); i++) {
            // while을 벗어날 때 e 포함 아래 숫자는 모두 c무게보다 적다. 
            while (e > 0 && left.get(i) + right.get(e) > c) {
                e--;
            }
            result += (e + 1);
        }
        System.out.println(result);
    }
    
    public static void dfs(int start, int end, int sum, ArrayList<Integer> list) {
        if(sum > c) {
            return;
        }
        if(start > end) {
            list.add(sum);
            return;
        }
        dfs(start + 1, end, sum, list); // 물건을 가방에 넣지 않은 경우
        dfs(start + 1, end, sum + arr[start], list); // 물건을 가방에 넣은 경우
    }
}
