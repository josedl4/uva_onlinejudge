#include <iostream>
#include <stdio.h>

using namespace std;

int main(){
    int iterations;
    cin >> iterations;

    while(iterations > 0){
        int a, b;
        cin >> a >> b;

        if (a > b) {
            cout << ">" << endl;
        } else if (a < b){
            cout << "<" << endl;
        } else {
            cout << "=" << endl;
        }

        iterations --;    
    }

    return 0;
}