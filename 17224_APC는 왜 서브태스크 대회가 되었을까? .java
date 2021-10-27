import java.io.*;
import java.util.*;

public class Main {
    static class Problem implements Comparable<Problem>{
        int low, high;
        Problem(int low, int high) {
            this.low = low;
            this.high = high;
        }

        @Override
        public int compareTo(Problem o) {
            if(high == o.high) {
                return o.low - low;
            }
            return high - o.high;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Problem> problems = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            problems.add(new Problem(a, b));
        }
        Collections.sort(problems);
        int ans = 0;
        for(int i = 0; i < n; i++) {
            Problem problem = problems.get(i);
            if(problem.high <= l) {
                ans += 140;
                k--;
            } else if(problem.low <= l) {
                ans += 100;
                k--;
            }
            if(k == 0) {
                break;
            }
        }
        System.out.println(ans);
    }
}

