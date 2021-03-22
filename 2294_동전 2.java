package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[a];
		int[] dp = new int[b+1];
		
		for(int i = 0; i < a; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 1; i <= b; i++){
			dp[i] = 100001;
		}
		
		for(int i = 0; i < a; i++){
			int value = arr[i];
			for(int j = arr[i]; j <= b; j++){
				dp[j] = Math.min(dp[j], dp[j-value]+1);
			}
		}
		if(dp[b] == 100001)
			System.out.println("-1");
		else
			System.out.println(dp[b]);
	}

}
