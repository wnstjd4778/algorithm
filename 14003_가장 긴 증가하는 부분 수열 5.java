import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] input, index;
    static ArrayList<Integer> lis;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        input = new int[n + 1];
        index = new int[n + 1];
        lis = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        if(n == 1) {
            System.out.println("1\n" + input[1]);
            return;
        }
        lis.add(input[1]);
        index[1] = 0;
        for(int i = 2; i <= n; i++) {
            if(input[i] > lis.get(lis.size() - 1)) {
                lis.add(input[i]);
                index[i] = lis.size() - 1;
            } else {
                binarySearch(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lis.size()).append('\n');
        Stack<Integer> stack = new Stack<>();
        int findId = lis.size() - 1;
        for(int i = n; findId >= 0 && i > 0; i--) {
            if(index[i] == findId) {
                findId--;
                stack.push(input[i]);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }
        System.out.println(sb);
    }
    static void binarySearch(int id) {
        int start, end, mid;
        start = 0;
        end = lis.size() - 1;
        while (start < end) {
            mid = (start + end) / 2;
            if(lis.get(mid) >= input[id]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        lis.set(start, input[id]);
        index[id] = start;
    }
}
