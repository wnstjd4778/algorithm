import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int result = Integer.parseInt(st.nextToken());
            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                q.offer(new int[] {j,Integer.valueOf(st.nextToken())});
            }
            count = 0;
            while (!q.isEmpty()) {
                // 큐에서 원소 하나를 꺼낸다.
                int[] front = q.poll();
                boolean isMax = true; // front가 가장 큰 원소인지 판단
                for (int j = 0; j < q.size(); j++) {
                    //  처음 꺼낸 원소보다 큐에 있는 j번째 원소가 중요도가 클 경우
                    if (front[1] < q.get(j)[1]) {
                        // 꺼낸 원소 및 j 이전의 원소들을 뒤로 보냄
                        q.offer(front);
                        for (int k = 0; k < j; k++) {
                            q.offer(q.poll());
                        }
                        isMax = false;
                        break;
                    }
                }
                // max가 아니면 넘김
                if(isMax == false) {
                    continue;
                }
                count++;
                if(front[0] == result) {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
