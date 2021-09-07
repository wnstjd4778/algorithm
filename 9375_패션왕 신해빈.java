import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
       while (val-- > 0) {
           HashMap<String, Integer> hm = new HashMap<>(); 

           int n = Integer.parseInt(br.readLine());
           while (n-- > 0) {
               StringTokenizer st = new StringTokenizer(br.readLine());
               st.nextToken();
               String kind = st.nextToken(); // 해쉬맵을 통해 kind를 저장
               if(hm.containsKey(kind)) {
                   hm.put(kind, hm.get(kind) + 1);
               } else {
                   hm.put(kind, 1);
               }
           }
           int result = 1;
           for(int value : hm.values()) {
               result *= (value + 1); // +1해주는 이유는 안입을 수도 있기 때문
           }
           sb.append(result - 1).append('\n'); // -1해주는 이유는 무조건 최소 한개는 입어야 하므로 모두 안입는 경우를 
       }
        System.out.println(sb);
    }
}
