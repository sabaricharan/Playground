#include<stdio.h>
int main()
{
	int num,term,even,odd,term2,a,d;
  scanf("%d",&num);
  if(num%2 == 1)
  {
    a = 0;d = 2;
    term = (num + 1)/2;
    even= a + ((term -1) * d) ;
    printf("%d",even);
    
  }
else
{
  a=0;d=1;
  term2 = num/2;
  even = a + ((term2 -1) *d);
  printf("%d",even);
}
}