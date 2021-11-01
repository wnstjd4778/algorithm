import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 0;
        int max = n;
        for(int i = 0; i < n; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }
        for(int i = 0; i < n - 1; i++) {
            int index = list.indexOf(max);
            if(index == 0) {
                min += list.get(index) - list.get(index + 1);
            } else if(index == list.size() - 1) {
                min += list.get(index) - list.get(index - 1);
            } else {
                min += Math.min(list.get(index) - list.get(index - 1), list.get(index) - list.get(index + 1));
            }
            list.remove(index);
            max--;
        }
        System.out.println(min);
    }
}
