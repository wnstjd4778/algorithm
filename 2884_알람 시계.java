package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b - 45 < 0){
			if(a == 0){
				a = 23;
				b=b+15;
			}
			else{
			a--;
			b=b+15;
			}
		}
		System.out.println(a + " " + b);

	}

}
