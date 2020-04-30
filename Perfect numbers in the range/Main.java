#include<iostream>
using namespace std;
int main()
{
  int a,b,n,sum;
  cin>>a>>b;
  for(int i=a;i<=b;i++)
  {
    n=1;
    sum=0;
    while(n<i)
    {
      if(i%n==0)
        sum=sum+n;
      n++;
    }
    if(sum==i)
      cout<<i<<" ";
  }
}