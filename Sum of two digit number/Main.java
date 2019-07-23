#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d",&a);
  b=a%10;
  a=a/10;
  
  
  printf("%d",b+a);
  //Type your code here
  return 0;
}