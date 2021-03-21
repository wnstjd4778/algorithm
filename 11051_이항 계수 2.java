package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int[][] dp = new int[1001][a+1];
		dp[1][0] = 1;
		dp[1][1] = 1;
		for(int i = 1; i <= a; i++){
			dp[i][0] = 1;
			dp[i][i] = 1;
			for(int j = 1; j < i; j++){
				dp[i][j] = (dp[i-1][j-1]+dp[i-1][j])%10007;
			}
		}
		System.out.println(dp[a][b]);

	}

}
