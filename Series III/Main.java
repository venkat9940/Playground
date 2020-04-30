#include<iostream>
using namespace std;
int main()
{
  int n,val=6;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<val<<" ";
    val=val+5*i;
  }
}