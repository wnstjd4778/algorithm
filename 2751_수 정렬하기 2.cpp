#include <stdio.h>


int sorted[1000000];

void merge(int a[], int m, int middle, int n){
	int i = m;
	int j = middle + 1;
	int k = m;
	int t;
	while(i <= middle && j <= n){
		if(a[i] <= a[j]){
			sorted[k] = a[i];
			i++;
		}
		else
		{
			sorted[k] = a[j];
			j++;
		}
		k++;
	}
	if(i > middle){
		for(t = j; t <= n;t++){
			sorted[k] = a[t];
			k++;
		}}
		else{
		for(t = i; t <= middle;t++){
			sorted[k] = a[t];
			k++;
		}
	}
	for(t = m; t <= n; t++){
		a[t] = sorted[t];
	}
}


void mergeSort(int a[], int m, int n){
	if(m < n){
		int middle = (m+n) / 2;
		mergeSort(a, m, middle);
		mergeSort(a, middle + 1, n);
		merge(a, m, middle, n);
	}
}

int main(){
	int i,s;
	scanf("%d", &s);
	int size[1000000];
	for(i = 0; i < s; i++){
		scanf("%d ", &size[i]);
	mergeSort(size, 0, s-1);
	for(i = 0; i < s; i++){
		printf("%d ", size[i]);
	}
	return 0;
}
