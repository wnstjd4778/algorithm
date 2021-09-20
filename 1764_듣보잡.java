import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(br.readLine(), i);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            String b = br.readLine();
            if(map.get(b) != null) {
                count++;
                arrayList.add(b);
            }
        }
        System.out.println(count);
        Collections.sort(arrayList);
        for(String val : arrayList) {
            System.out.println(val);
        }
    }
}
