import java.io.*;
import java.util.*;


public class Main {
    static class Lecture{
        int cost, day;
        Lecture(int cost, int day) {
            this.cost = cost;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Lecture> list = new ArrayList<>();
        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new Lecture(a, b));
        }
        Collections.sort(list, new Comparator<Lecture>() {
            @Override
            public int compare(Lecture o1, Lecture o2) {
                if(o1.cost == o2.cost) {
                    return o2.day - o1.day;
                }
                return o2.cost - o1.cost;
            }
        });
        int ans = 0;
        boolean[] check = new boolean[10001];
        for(int i = 0; i < size; i++) {
            Lecture lecture = list.get(i);
            for(int j = lecture.day; j > 0; j--) {
                if(!check[j]) {
                    check[j] = true;
                    ans += lecture.cost;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}



