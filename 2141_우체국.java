import java.io.*;
import java.util.*;

public class Main {

    static class Town implements Comparable<Town> {
        long position;
        long people;
        Town(long position, long people) {
            this.position = position;
            this.people = people;
        }

        @Override
        public int compareTo(Town o) {
            return Long.compare(this.position, o.position);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Town[] towns = new Town[n];
        double personMid = 0;
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            towns[i] = new Town(a, b);
            personMid += b;
        }
        Arrays.sort(towns);
        personMid /= 2;
        long person = 0;
        int i = 0;
        while (person < personMid) {
            person += towns[i].people;
            i++;
            if(i == n) {
                break;
            }
        }
        System.out.println(towns[i - 1].position);
    }
}
