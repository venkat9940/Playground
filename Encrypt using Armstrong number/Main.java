#include <iostream>
using namespace std;
int power(int, int);

int main()
{
  int n, sum = 0, t, remainder, digits = 0;
cin>>n;
  t = n;

  while (t != 0) {
    digits++;
    t = t/10;
  }

  t = n;

  while (t != 0) {
    remainder = t%10;
    sum = sum + power(remainder, digits);
    t = t/10;
  }

  if (n == sum)
    cout<<"Kindly proceed with encrypting";
  else
   cout<<"It is not an Armstrong number";

  return 0;
}

int power(int n, int r) {
  int c, p = 1;

  for (c = 1; c <= r; c++)
    p = p*n;

  return p;
}