import java.io.*;
import java.util.*;

public class Main {

    static class Person implements Comparable<Person>{
        int num;
        double score;
        Person(int num, double score) {
            this.num = num;
            this.score = score;
        }

        @Override
        public int compareTo(Person o) {
            if(score > o.score) {
                return -1;
            } else if(score == o.score) {
                return 0;
            } else {
                return 1;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Person> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                int a = Integer.parseInt(st.nextToken());
                double b = Double.parseDouble(st.nextToken());
                list.add(new Person(a, b));
            }
        }
        double sum = 0;
        Collections.sort(list);
        boolean check[] = new boolean[n + 1];
        int i = 0;
        while (true){
            if(k == 0) {
                break;
            }
            Person person = list.get(i++);
            if(!check[person.num]) {
                check[person.num] = true;
                sum += person.score;
                k--;
            }
        }
        System.out.println(Math.round(sum *10) / 10.0);
    }
}
