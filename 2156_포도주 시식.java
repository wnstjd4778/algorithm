package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		long [] result = new long[10001];
		long [] dp = new long[10001];
		for(int i = 1; i <= n; i++){
			dp[i] = sc.nextInt();
		}
		result[1] = dp[1];
		result[2] = dp[1]+dp[2];
		result[3] = Math.max(dp[2]+dp[3],Math.max(result[2], dp[1]+dp[3]));
		for(int i = 4; i <= n; i++){
			long a,b,c;
			a = dp[i]+result[i-2];
			b = result[i-1];
			c = dp[i]+dp[i-1]+result[i-3];
			result[i] = Math.max(Math.max(a, b),c);
		}
		System.out.println(result[n]);
	}

}
