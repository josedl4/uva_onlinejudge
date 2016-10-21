#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

int main(){

    while(true){
        int a, b, c;

        cin >> a >> b >> c;    

        if((a == 0) && (b == 0) && (c == 0))
            break;
       
        if(b > a && b > c){
            int tmp = b;
            b = a;
            a = tmp;

        }else{

            if(c > a && c > b){
                int tmp = c;
                c = a;
                a = tmp;
            }
        }
        
        if(pow(a,2) == (pow(b, 2) + pow(c, 2)))
            cout << "right" << endl;
        else
            cout << "wrong" << endl;
    }

    return 0;
}