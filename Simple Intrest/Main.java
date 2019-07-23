#include<stdio.h>
int main()
{
 float principle,years,intrest;
  scanf("%f%f%f",&principle,&years,&intrest);
  float ans = (principle * years * intrest)/100 ;
  printf("%f",ans);
  return 0;
}