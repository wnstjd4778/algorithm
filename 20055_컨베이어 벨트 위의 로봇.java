import java.io.*;
import java.util.*;


public class Main {
    static int n, k, count;
    static List<Robot> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 2 * n; i++) {
            list.add(new Robot(false, Integer.valueOf(st.nextToken())));
        }
        while (true) {
            Robot robot = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, robot);
            if(list.get(n - 1).isUse) {
                list.get(n - 1).isUse = false;
            }

            for(int i = n - 1; i >= 0; i--) {
                Robot now = list.get(i);
                if(now.isUse) {
                    Robot next = list.get(i + 1);
                    if(!next.isUse && next.x > 0) {
                        now.isUse = false;
                        next.x--;
                        next.isUse = true;
                        if((i + 1) == n - 1) {
                            next.isUse = false;
                        }
                    }
                }
            }

            Robot first = list.get(0);
            if(first.x > 0) {
                first.isUse = true;
                first.x--;
            }
            if(check()) {
                break;
            }
            count++;
        }
        System.out.println(count + 1);
    }
    static boolean check() {
        int cnt = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).x == 0) {
                cnt++;
            }
        }
        if(cnt >= k) {
            return true;
        } else {
            return false;
        }
    }
    static class Robot{
        boolean isUse;
        int x;
        Robot(boolean isUse, int x) {
            this.isUse = isUse;
            this.x = x;
        }
    }
}
