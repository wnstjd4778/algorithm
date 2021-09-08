import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

    public static Stack<Integer> results = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());
        for(int i = 0; i < val; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            int data = 0;
            if(input.length > 1) {
                data = Integer.parseInt(input[1]);
            }
            solution(command, data);
        }
    }

    public static void solution (String command,int data){

        //command별 기능 수행
        if (command.equals("push")){
            results.push(data);
        }else if(command.equals("pop")){
            if(results.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(results.pop());
            }
        }else if(command.equals("top")){
            if(results.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(results.peek());
            }
        }else if(command.equals("size")){
            System.out.println(results.size());
        }else if(command.equals("empty")){
            if(results.isEmpty()){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
