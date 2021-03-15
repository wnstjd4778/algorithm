#include <iostream>

using namespace std;

int d[41];

int main(){
	int n, maxx;
	cin >> n;
	int a[n+1] ={0,};
	int b[41][2];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	b[0][0] = 1;
	b[0][1] = 0;
	b[1][0] = 0;
	b[1][1] = 1;
	for(int i = 2; i <= 41;i++){
		for(int j = 0; j < 2; j++){
			b[i][j] = b[i-1][j]+b[i-2][j];
		}
	}
	for(int i = 0; i < n; i++){
		for(int j = 0; j < 2; j++){
			printf("%d ", b[a[i]][j]);
		}
		printf("\n");
	}
}
