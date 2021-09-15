import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Node> list[];
	static long dp[];
	static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        list = new ArrayList[N + 1];
        dp = new long[N + 1];
        for (int i = 1; i <= N; i++) {
        	list[i] = new ArrayList<>();
        	dp[i] = Integer.MAX_VALUE;
        }
        
        for (int i = 0; i < M; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	int cost = Integer.parseInt(st.nextToken());
        	
        	// 단방향으로 추가
        	list[start].add(new Node(end, cost));
        }
        
        
        StringBuilder sb = new StringBuilder();
        if(bellman()) {
        	for (int i = 2; i <= N; i++) {
        		if (dp[i] == Integer.MAX_VALUE) {
        			// 방문할 수 없었다는 뜻
        			sb.append(-1 + "\n");
        		} else {
        			sb.append(dp[i] + "\n");
        		}
        	}
        } else {
        	// 음의 사이클이 있는 경우
        	sb.append("-1");
        }
        System.out.println(sb);
    }
    
    static boolean bellman() {
    	dp[1] = 0;
    	
    	// 정점의 수 - 1 만큼 반복문을 돌림
    	for (int i = 1; i < N; i++) {
    		
    		// 1에서 출발해서 방문가능한 곳 탐색
    		for (int j = 1; j <= N; j++) {
    			for (Node node : list[j]) {
    				// 아직 해당 지점까지는 도착하지 못했으므로 탐색할 필요 없음.
    				if (dp[j] == Integer.MAX_VALUE) break;
    				
    				if (dp[node.next] > dp[j] + node.cost) {
    					dp[node.next] = dp[j] + node.cost;
    				}
    			}
    		}
    	}
    	
    	// 한번 더 탐색해서 또 값이 바뀌면 음의 사이클이 있다는 뜻
    	for (int i = 1; i <= N; i++) {
    		for (Node node : list[i]) {
    			if (dp[i] == Integer.MAX_VALUE) break;
				if (dp[node.next] > dp[i] + node.cost) return false;
			}
    	}
    	return true;
    }
}

class Node {
	int next;
	int cost;
	
	Node (int next, int cost) {
		this.next = next;
		this.cost = cost;
	}
}
