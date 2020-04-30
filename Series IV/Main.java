#include<iostream>
using namespace std;
int main()
{
  int n,c;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      c=i*i-1;
    }
    else
    {
      c=i*i-2;
    }
    cout<<c<<" ";
  }
}
