import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> vote = new ArrayList<>();
        for(int i = 0; i < n - 1; i++) {
            vote.add(Integer.valueOf(br.readLine()));
        }
        if(n == 1) {
            System.out.println(0);
            return;
        }
        int count = 0;
        while (Collections.max(vote) >= m) {
            int i = vote.indexOf(Collections.max(vote));
            vote.set(i, vote.get(i) - 1);
            m++;
            count++;
        }
        System.out.println(count);
    }
}
