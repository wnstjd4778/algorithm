#include <stdio.h>

int main(){
	int n, min, index, temp;
	scanf("%d", &n);
	int size[n];
	int i, j; 
	for(i = 0; i < n; i++){
		scanf("%d", &size[i]);
	}
	
	for(i = 0; i < n; i++){
		min=1001;
		for(j = i; j < n;j++){
			if(min > size[j]){
				min = size[j];
				index = j;
			}
		}
		temp = size[i];
		size[i] = size[index];
		size[index] = temp;
	}
	for(i = 0; i < n; i++){
		if(size[i]!=size[i+1])
		printf("%d ", size[i]);
	}
}
