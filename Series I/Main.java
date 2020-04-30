#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  float val=0.5;
  for(int i=1;i<=n;i++)
  {
    printf("%.1f ",val);
    val=val*3;
  }
}