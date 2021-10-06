import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> cranes = new ArrayList<>();
        ArrayList<Integer> boxes = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            cranes.add(Integer.valueOf(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            boxes.add(num);
        }
        int time = 0;
        Collections.sort(cranes, Collections.reverseOrder());
        Collections.sort(boxes, Collections.reverseOrder());
        if(cranes.get(0) < boxes.get(0)) {
            System.out.println(-1);
            return;
        }
        while (!boxes.isEmpty()) {
            int index = 0;
            for(int i = 0; i < cranes.size();) {
                if(index == boxes.size()) break;
                if(cranes.get(i) >= boxes.get(index)) {
                    boxes.remove(index);
                    i++;
                } else {
                    index++;
                }
            }
            time++;
        }
        System.out.println(time);
    }
}


