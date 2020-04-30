#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int n,val;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    val=pow(11+4*i,2);
    cout<<val<<" ";
  }
}