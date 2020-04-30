#include<iostream>
using namespace std;
int main()
{
int n,f1=0,f2=1,s,next=0,i;
  cin>>n;
  if(n==0||n==1)
    cout<<n;
  else
    next=f1+f2;
  for(i=3;i<=n;++i)
  {
     f1=f2;
     f2=next;
     next=f1+f2;
  }
  cout<<f2;
}