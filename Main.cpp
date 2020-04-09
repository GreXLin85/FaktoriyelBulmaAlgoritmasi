/*
* 
* Faktoriyel bulma algoritması
* 
*/

#include <iostream>

using namespace std; 

int main()
{
    long sonuc = 1;
    int faktoriyel;

    cout << "Kac faktoriyel hesaplatmak istiyorsun? :";
    cin >> faktoriyel;

    for (size_t i = 1; i <= faktoriyel; i++)
    {
        sonuc *= i;
    }
    cout << sonuc;

    return 0;
}
