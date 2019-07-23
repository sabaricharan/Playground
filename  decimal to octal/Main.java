#include<stdio.h>
int main()
{
  int i,n,a[120];
  scanf("%d",&n);
  for(i=0;n>0;i++)
  {
    a[i]=n%8;
    n=n/8;
  }
  for(i = i-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }  return 0;
}