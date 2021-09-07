import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
// 가능한 한 많은 구간을 선택하는 문제(그리디 알고리즘)
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[][] time = new int[size][2];
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return  o1[0] - o2[0];
                }
                return  o1[1] - o2[1];
            }
        });
        int count = 0;
        int end = 0;
        for(int i = 0; i < size; i++) {
            if(end <= time[i][0]) {
                end = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }

}
