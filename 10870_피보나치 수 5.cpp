#include <iostream>

using namespace std;

int d[10000];
int fibonacci(int n){
	if( n == 0) return 0;
	else if( n == 1) return 1;
	else if(n == 2) return 1;
	else if(n == 3) return 2;
	else if(d[n] != 0) return d[n];
	else return d[n] = fibonacci(n-1)+fibonacci(n-2);
}
int main(){
	int n;
	cin >> n;
	printf("%d", fibonacci(n));
}
