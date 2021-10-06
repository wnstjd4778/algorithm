import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Subject> list = new ArrayList<>();
        boolean[] check = new boolean[1001];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new Subject(a, b));
        }
        Collections.sort(list, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o2.score - o1.score;
            }
        });
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int num = list.get(i).end;
            for(int j = num; j > 0; j--) {
                if(!check[j]) {
                    check[j] = true;
                    ans += list.get(i).score;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
    static class Subject {
        int end, score;
        Subject(int end, int score) {
            this.end = end;
            this.score = score;
        }
    }
}


