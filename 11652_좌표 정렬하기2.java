import java.io.*;
import java.util.*;


public class Main {

    public static class a {
        int x, y;
        public a(int x, int y) {
            this.x= x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        a[] a = new a[size];
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            a[i] = new a(x, y);
        }

        Arrays.sort(a, new Comparator<Main.a>() {
            @Override
            public int compare(Main.a o1, Main.a o2) {
                if(o1.y == o2.y) {
                    return o1.x - o2.x;
                } else {
                    return o1.y - o2.y;
                }
            }
        });
        for(int i = 0; i < size; i++) {
            System.out.println(a[i].x + " " + a[i].y);
        }
    }
}
