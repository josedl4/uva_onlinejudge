#include <iostream>
#include <stdio.h>

using namespace std;

int main(){
    int count;

    cin >> count;

    for (int i = 0; i < count; i++) {
        
        int sum, res;
        cin >> sum >> res;

        if((sum >= res) && (sum % 2 == res % 2))
            cout << ((sum+res)/2) << " " << ((sum-res)/2) << endl;
        else
            cout << "impossible" << endl;
    }

    return 0;
}