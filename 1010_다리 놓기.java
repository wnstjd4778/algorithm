package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n+1];
		for(int i = 0; i < n; i++){
				int a= sc.nextInt();
				int b= sc.nextInt();
				long sum = 1;
				for(int j = b; j > a; j--){
					sum *=j;
					sum /= b-j+1;
				}
				arr[i] = sum;
		}
		for(int i = 0; i < n; i++){
		System.out.println(arr[i]);
		}
		sc.close();
	}
}
