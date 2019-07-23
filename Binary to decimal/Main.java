#include<stdio.h>
#include<math.h>
int main()
{
  int num,a,sum=0,rem,i=0;
  scanf("%d",&num);
  while(num!=0)
  {
    rem = num % 10;
    sum = sum + rem*pow(2,i);
    num = num/10;
    i++;
  }
  printf("%d",sum);
  return 0;
}