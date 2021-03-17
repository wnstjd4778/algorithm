package dynamic;

import java.util.Scanner;

public class Main {
	static int max;
	static Integer[] index;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		index = new Integer[n+1];
		arr = new int[n+1];
		for(int i = 1; i <= n; i++){
			arr[i] = sc.nextInt();
		}
		index[1] = arr[1];
		max = arr[1];
		
		recur(n);
		
		System.out.println(max);
		
		
		
	}

	static int recur(int n){
		if(index[n] == null){
			index[n] = Math.max(recur(n-1)+arr[n], arr[n]);
			
			max = Math.max(index[n], max);
		}
		return index[n];
	}
}
