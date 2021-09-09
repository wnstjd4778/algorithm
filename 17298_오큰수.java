import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{

    public static Stack<Integer> stack = new Stack<>();
    public static int size;
    public static int[] num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        size = Integer.parseInt(br.readLine());
        num = new int[size];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < size; i++) {
            // 스택이 비어 있지 않고 현재 원소가 스택의 맨위 원소가 가리키는 원소보다 큰 경우
            // 해당 조건을 만족할 때까지 stack의 원소를 pop하면서 해당 인덱스의 값을 현재 원소로 바꿔준다.
            while (!stack.isEmpty() && num[stack.peek()] < num[i]) {
                num[stack.pop()] = num[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            num[stack.pop()] = -1;
        }
        for(int val : num) {
            sb.append(val).append(' ');
        }
        System.out.println(sb);
    }
}
