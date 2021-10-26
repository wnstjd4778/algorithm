import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Problem implements Comparable<Problem> {
        int deadLine;
        int score;
        Problem(int deadLine, int score) {
            this.deadLine = deadLine;
            this.score = score;
        }

        @Override
        public int compareTo(Problem o) {
            if(deadLine == o.deadLine) {
                return o.score - score;
            }
            return deadLine - o.deadLine;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        ArrayList<Problem> problems = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Problem p = new Problem(a, b);
            problems.add(p);
        }

        Collections.sort(problems);
        long ans = 0;
        for(Problem problem : problems) {
            int size = q.size();
            if(size < problem.deadLine) {
                q.offer(problem.score);
            }
            else if(size == problem.deadLine) {
                int noodleCount = q.peek();
                if(noodleCount < problem.score) {
                    q.poll();
                    q.offer(problem.score);
                }
            }
        }
        while (!q.isEmpty()) {
            ans += q.poll();
        }
        System.out.println(ans);
    }
}

