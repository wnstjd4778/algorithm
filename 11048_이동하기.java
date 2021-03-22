package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[a+1][b+1];
		int[][] arr = new int[a+1][b+1];
		for(int i = 1; i <= a; i++){
			for(int j = 1; j <= b; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		for(int i = 1; i <= a; i++){
			for(int j = 1; j <= b; j++){
				dp[i][j] = Math.max(Math.max(dp[i-1][j]+arr[i][j], dp[i][j-1]+arr[i][j]), dp[i-1][j-1]+arr[i][j]);
				}
			}
		sb.append(dp[a][b]);
		System.out.println(sb.toString());

	}

}
