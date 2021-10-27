import java.io.*;
import java.util.*;

public class Main {
    static class Cow implements Comparable<Cow> {
        int a, b;
        Cow(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Cow o) {
            return a - o.a;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int time = 0;
        ArrayList<Cow> cows = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            cows.add(new Cow(a, b));
        }
        Collections.sort(cows);
        for(int i = 0; i < n; i++) {
            Cow cow = cows.get(i);
            if(time >= cow.a) {
                time += cow.b;
            } else {
                time = cow.a;
                time += cow.b;
            }
        }
        System.out.println(time);
    }
}
