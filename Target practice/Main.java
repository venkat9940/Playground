#include<iostream>
using namespace std;
int main()
{
int num,sum=0,count=0,n;
  cin>>num;
  for(count=0;sum<num;count++)
  {
    cin>>n;
    sum=sum+n;
  }
  cout<<"The number of turns is "<<count;
}