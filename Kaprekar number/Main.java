#include<bits/stdc++.h>
using namespace std;
bool kaprekar(int n)
{
  if(n==1)
    return true;
  int sqr=n*n;
  int ctr=0;
  while(sqr)
  {
    ctr++;
    sqr/=10;
  }
  sqr=n*n;
  for (int r=1;r<ctr;r++)
  {
    int eq=pow(10,r);
    if(eq==n)
      continue;
    int sum=sqr/eq+sqr%eq;
    if(sum==n)
      return true;
  }
  return false;
}
int main()
{
  int kp;
  cin>>kp;
  kaprekar(kp)?cout<<"Kaprekar Number":cout<<"Not a Kaprekar Number";
  cout<<endl;
}