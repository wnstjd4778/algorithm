import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 원의 공식을 잘 알지 못해 몇번 틀렸었다.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++) {
            String value = br.readLine();
            StringTokenizer st = new StringTokenizer(value);
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            if(x1 == x2 && y1 == y2 && r1 == r2) { // 접점에 무한대인 경우
                System.out.println(-1);
            } else if((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) > (r2+r1)*(r2+r1)) { // 두 원이 밖에서 안 접할 경우(외접) 
                System.out.println(0);
            } else if((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) < (r2-r1)*(r2-r1)) { // 두 원이 안에서 안 접할 경우(내접)
                System.out.println(0);
            } else if((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) == (r2-r1)*(r2-r1)) { // 두 원이 안에서 접할 경우(내접)
                System.out.println(1);
            } else if((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) == (r2+r1)*(r2+r1)) { // 두 원이 밖에서 접할 경우(외접)
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
