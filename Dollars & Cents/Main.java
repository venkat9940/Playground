#include<iostream>
using namespace std;
int main()
{
  double a,b,c,i,d,j,s;
  cin>>a>>b>>c>>d;
  s=a+(b/100)+c+(d/100);
  j=int(s);
  i=(s-j)*100;
  cout<<j<<"\n"<<i;
}