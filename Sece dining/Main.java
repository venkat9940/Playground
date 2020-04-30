#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string s;
  int a,l=0,r=0;
  cin>>s>>a;
  if(s[0]=='f')
    if(a==1)
      cout<<"Left Handed";
  else
    cout<<"Right Handed";
  else if (s[0]=='r')
    if (a==1)
      cout<<"Right Handed";
  else cout<<"Left Handed";
}