#include<iostream>
using namespace std;
int main()
{
  int n,rem,sum=0,temp;
  cin>>n;
  temp =n;
  while(temp>0 || sum>9)
  {
      if(temp == 0) 
        { 
            temp = sum; 
            sum = 0; 
       }
    rem = temp%10;
    sum = sum + rem;
    temp  = temp/10;
   
  }
  cout<<sum;
}