#include<iostream>
using namespace std;
int main()
{
 int n,count=0,rem,rev=0;
  cin>>n;
  do
  {
    rem=n%10;
    rev=rev*10+rem;
    n=n/10;
    count++;
  }while(n!=0);
    cout<<count;
}