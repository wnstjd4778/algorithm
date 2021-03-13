#include <stdio.h>

int a[100001];
int n;
	
int main(){
	scanf("%d", &n);
	for(int i = 0 ; i < n; i++){
		int x;
		scanf("%d", &x);
		a[x]++;
	}
	
	for(int i = 0; i < 10001; i++){
		while(a[i] != 0){
			printf("%d\n", i);
			a[i]--;
		}
	
}
}
