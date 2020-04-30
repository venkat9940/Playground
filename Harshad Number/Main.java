#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,r;
  cin>>n;
  r=n;
  while(r)
  {
    sum=sum+r%10;
    r=r/10;
  } 
  int res=n%sum;
  if(res==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}