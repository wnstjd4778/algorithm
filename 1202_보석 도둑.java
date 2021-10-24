import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Jewel implements Comparable<Jewel>{
        int weight;
        int price;
        Jewel(int weight, int price) {
            this.price = price;
            this.weight = weight;
        }

        @Override
        public int compareTo(Jewel o) {
            return weight - o.weight;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Jewel[] jewels = new Jewel[n];
        ArrayList<Integer> bags = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            Jewel jewel = new Jewel(weight, price);
            jewels[i] = jewel;
        }
        for(int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            bags.add(num);
        }
        Collections.sort(bags);
        Arrays.sort(jewels);
        long ans = 0;
        int startIndex = 0;
        for(int weight : bags) {
            while (startIndex < n) {
                if(weight >= jewels[startIndex].weight) {
                    q.offer(-(jewels[startIndex].price));
                    startIndex++;
                } else {
                    break;
                }
            }
            if(!q.isEmpty()) {
                ans += Math.abs(q.poll());
            }
        }
        System.out.println(ans);
    }
}

