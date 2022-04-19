import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        String maxBook = "";

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            if(!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }

        for(String key : map.keySet()) {
            int value = map.get(key);

            if(max == value && maxBook.compareTo(key) > 0) {
                maxBook = key;
                max = value;
            } else if(max < value) {
                maxBook = key;
                max = value;
            }
        }

        System.out.println(maxBook);
    }
}
