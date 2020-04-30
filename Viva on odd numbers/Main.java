#include<iostream>
using namespace std;
int main()
{
  int num,count=0;
  float total=0;
  do
  {
    cin>>num;
    if(num<0)
      total=total-1.0;
    else if(num%2 ==1)
    {
      count++;
      total++;
    }
    else
      total=total-0.5;
  }while(num>0&& count!=3);
  printf("%.1f",total);
}