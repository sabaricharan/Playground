#include<stdio.h>
int main()
{
	long int num,i,fact;
  scanf("%ld",&num);
  fact = 1;
  for ( i = 1 ;i <= num; i++)
  {
    fact = fact * i;
  }
  printf("%ld",fact);
  return 0;
}