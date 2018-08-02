#include<iostream>
#include<bits/stdc++.h>
#include<map>

using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		long long int n;
		cin>>n;
		
		int a[n];
		map<int,int> m;
		
		for(long long int i = 0;i<n;i++){
			cin>>a[i];
			m[a[i]]++;
		}
		
		long long int count = 0;
		
		for(long long int i = 0;i<n;i++){
			for(long long int j = i+1;j<n;j++){
				
				if((((a[i]+a[j])&1)!=1) && m[(a[i]+a[j])/2] != 0){
					count++;
				}
			}
		}
		
		cout<<count<<endl;
	}
	return 0;
}
