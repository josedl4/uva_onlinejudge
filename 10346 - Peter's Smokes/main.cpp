#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

int test(int n, int k, int res){
    if(n >= k){
        res += n/k;
        return test((n/k + n%k), k, res);
    } else {
        return res;
    }

}

int main(){

    int n, k;

    while(cin >> n){
    
        cin >> k;

        int res = test(n, k ,0);
        cout <<  res + n << endl;
    }
}

