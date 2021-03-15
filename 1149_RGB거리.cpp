#include <iostream>

using namespace std;

int main(){
	int n;
	cin >> n;
	int sum[3];
	int dp[n+1][3] = {0,};
	int a[n+1][4] = {0,};
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= 3; j++){
			cin >> a[i][j];
		}
	}
	
	for(int k = 1; k <=n; k++){
		dp[k][1] = min(dp[k-1][2],dp[k-1][3])+a[k][1];
			dp[k][2] = min(dp[k-1][1],dp[k-1][3])+a[k][2];
				dp[k][3] = min(dp[k-1][2],dp[k-1][1])+a[k][3];
	}
	printf("%d", min(min(dp[n][1],dp[n][2]),dp[n][3]));
}
