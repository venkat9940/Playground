#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    int term=pow(11+4*i,2);
      cout<<term<<" ";
  }
}