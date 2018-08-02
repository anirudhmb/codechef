#include <iostream>
using namespace std;

int main(){
    long long int c = 0, n, k;
    cin>>n>>k;
    while(n--){
        long long int x;
        cin>>x;
        if(x%k==0)c++;
    }
    cout<<c<<endl;
    return 0;
}