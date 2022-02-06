import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    // 드래곤 클래스를 만들고 파워가 오름차순으로 정렬을 할 수 있도록한다.
    static class Dragon implements Comparable<Dragon> {
        int power; // 드래곤의 파워
        int bonus; // 드래곤을 잡으면 주는 보너스

        Dragon(int power, int bonus) {
            this.power = power;
            this.bonus = bonus;
        }

        // 파워의 오름차순으로 정렬
        @Override
        public int compareTo(Dragon o) {
            return power - o.power;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken()); // Kirito의 현재 파워
        int n = Integer.parseInt(st.nextToken()); // 드래곤의 마리 수
        ArrayList<Dragon> dragons = new ArrayList<>(); // 드래곤의 클래스를 담을 배열
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int power = Integer.parseInt(st.nextToken());
            int bonus = Integer.parseInt(st.nextToken());
            dragons.add(new Dragon(power, bonus));
        }
        
        Collections.sort(dragons);
        
        // 가장 작은 힘의 드래곤 순서로 가져와 현재 Kirito의 해당 드래곤의 파워보다 크면
        // Kirito의 힘에 보너스를 추가하고 아니면 NO를 출력한다.
        for(int i = 0; i < n; i++) {
            if(s > dragons.get(i).power) {
                s += dragons.get(i).bonus;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
