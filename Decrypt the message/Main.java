#include<iostream>
using namespace std;
int main()
{
  int num1,num2,a,rm,sum=0;
  cin>>num1>>num2;
  a=num1+num2;
  for (int i=1;i<=(a-1);i++)
  {
    rm=a%i;
       if (rm == 0) {  
       sum=sum+i;     
       }  
  }
            if(sum==a)
              cout<<"They can read the message";
           else
             cout<< "They can't read the message";
    
}