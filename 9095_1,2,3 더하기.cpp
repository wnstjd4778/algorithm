# include <iostream>
# include <algorithm>

using namespace std; 

int main(){
	int n, min= 0;
	
	int d[12] = {0,};
	cin >> n;
	int a[n] ={0,};
	d[1] = 1;
	d[2] = 2;
	d[3] = 4;
	for(int i = 1; i <= n; i++){
		cin >> a[i];
	}
	
	for(int i = 1; i <= n; i++){
		if(min < a[i]){
			min = a[i];
		}
	}
	for(int i = 4; i <= min; i++){
		d[i] = d[i-1]+d[i-2]+d[i-3];
	}
	
	for(int i = 1; i <= n; i++){
		printf("%d\n", d[a[i]]);
	}
}
