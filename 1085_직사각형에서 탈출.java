import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();
        StringTokenizer st = new StringTokenizer(value);
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int halfW = w / 2;
        int halfH = h / 2;
        int distanceX = 0;
        int distanceY = 0;
        if(x <= halfW) { // halfW보다 작으면 (0,h)이 가깝고 halfW보다 크면 (x,h)가 가깝다. w/2가 나머지가 있을수도 있으므로 <=를 사용했다. 
            distanceX = x;
        } else {
            distanceX = w - x;
        }
        if(y <= halfH) {
            distanceY = y;
        } else {
            distanceY = h - y;
        }
        if(distanceX > distanceY) {
            System.out.println(distanceY);
        } else {
            System.out.println(distanceX);
        }
    }
}
