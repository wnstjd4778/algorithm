#include <stdio.h>

int main(){
	int n, count = 0;
	scanf("%d", &n);
	while(1){
	if(n % 5 ==0){
		count = n / 5;
		break;
	}
	for(int i = n/5; i > 0 ; i--){
		int x = n - (5*i);
		if(x % 3 ==0){
			count = i+x/3;
			break;
		}}
	if(count != 0){
		break;
	}
	if(n % 3 == 0){
		count = n/3;
		break;
	}
	else{
	count = -1;
	break;}
}
printf("%d", count);
}
