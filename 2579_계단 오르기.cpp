#include <iostream>

using namespace std;

int main(){
	int n;
	cin >> n;
	int score[n+1] = {0,};
	int result[n+1] = {0,};
	for(int i = 1; i <=n; i++){
		cin >> score[i];
	}
	result[1] = score[1];
	result[2] = score[1]+score[2];
	result[3] = max(score[2]+score[3],score[1]+score[3]);
	for(int i = 4; i <=n; i++){
		int x = score[i-1]+score[i]+ result[i-3];
		int y = score[i]+result[i-2];
		result[i] = max(x,y);
	}
	printf("%d", result[n]);
}
