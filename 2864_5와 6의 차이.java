import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String m = st.nextToken();
        String minA = "" , minB = "" , maxA = "", maxB = "";
        for(int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if(c == '6') {
                minA += '5';
            } else {
                minA += c;
            }
            if(c == '5') {
                maxA += '6';
            } else {
                maxA += c;
            }
        }
        for(int i = 0; i < m.length(); i++) {
            char c = m.charAt(i);
            if(c == '6') {
                minB += '5';
            } else {
                minB += c;
            }
            if(c == '5') {
                maxB += '6';
            } else {
                maxB += c;
            }
        }
        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        System.out.println(min + " " + max);
    }
}
