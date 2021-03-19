package dynamic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sum = new int[n+1];
		int[] arr = new int[n+1];
		for(int i = 1; i <= n; i++){
			arr[i] = sc.nextInt();
		}
		sum[0] = 0;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				sum[i] = Math.max(sum[i], sum[i-j]+arr[j]);
			}
		}
		System.out.println(sum[n]);
	}

}
