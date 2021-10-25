import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int[] seq = new int[k];
        Set<Integer> set = new HashSet<>();

        int count = 0;
        for(int i = 0; i < k; i++) {
            int num = list.get(i);
            if(set.contains(num)) {
                continue;
            }
            if(set.size() < n && set.add(num)) {
                continue;
            }
            int max = -1;
            int idx = -1;
            for(int s : set) {
                int tmp = 0;
                List<Integer> sub = list.subList(i + 1, k);
                if(sub.contains(s)) {
                    tmp = sub.indexOf(s) + 1;
                } else {
                    tmp = k - i - 1;
                }
                if(tmp > max) {
                    max = tmp;
                    idx = s;
                }
            }
            set.remove(idx);
            set.add(num);
            count++;
        }
        System.out.println(count);
    }

}

