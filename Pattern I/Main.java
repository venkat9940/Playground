#include<iostream>
using namespace std;
int main()
{
  int i,j,n;
  cin>>n;
  for(i=n;i<=n+3;i++)
  {
    for(j=n;j<=i;j++)
    {
      if(j<i)
        cout<<i;
      else 
        cout<<i;
    }
    cout<<"\n";
  }
   for(i=n+3;i>=n;i--)
  {
    for(j=n;j<=i;j++)
    {
      if(j<i)
        cout<<i;
      else 
        cout<<i;
    }
    cout<<"\n";
  }
}