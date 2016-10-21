#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

int main(){
    int n, p;

    while(true){
        if(scanf("%d", &n) != 1){break;}
        if(scanf("%d", &p) != 1){break;}

        double result = pow(p, (double)(1.0/n));

        cout << result << endl;
    
    }

    return 0;
}