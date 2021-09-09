import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deque = new LinkedList<>();
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; i++) {
            deque.offer(i);
        }
        st = new StringTokenizer(br.readLine());
        int[] seq = new int[m];
        for(int i = 0; i < m; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < m; i++) {
            int target_idx = deque.indexOf(seq[i]);
            int half_idx;

            if(deque.size() % 2 == 0) { // 배열의 반을 구하기
                half_idx = deque.size() / 2 - 1;
            }
            else {
                half_idx = deque.size() / 2;
            }

            if(target_idx <= half_idx) { // 배열의 사이즈의 반보다 작은 경우
                for(int j = 0; j < target_idx; j++) {
                    // 앞에서 꺼내서 뒤에 넣음
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }
            else {
                for(int j = 0; j < deque.size() - target_idx; j++) {
                    //뒤에서 꺼내서 앞에 넣음
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }

        System.out.println(count);
    }
}
