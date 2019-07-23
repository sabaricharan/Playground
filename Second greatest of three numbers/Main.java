#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  if (a>b && c>a)
  {
   printf("%d",a);
  }
  else if(b>a && b<c)
  {
    printf("%d",b);
  }
  else if (c>a && b>c)
  {
    printf("%d",c);
  }
  
  
}