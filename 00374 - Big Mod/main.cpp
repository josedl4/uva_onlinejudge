#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

int bigMod(int b, int p, int m){
    
    if(p == 0) return 1;
    
    if(p % 2 == 1){

        int part1 = b % m;
        int part2 = bigMod(b, p-1, m);
        return (part1 * part2) % m;
    
    } else {
    
        int half = bigMod(b, p/2, m);
        return (half * half) % m;
    
    }
}

int main(){

    int b, p, m;

    while(cin >> b){
        
        
        cin >> p;
        cin >> m;
        

        int result = bigMod(b, p, m);

        cout << result << endl;
    }

    return 0;
}