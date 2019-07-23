#include <stdio.h>
int main()
{
  	int base,power,ans=1,i;
  scanf("%d%d",&base,&power);
 
  if(power>=0)
  {
    for (i =1 ; i <= power ;i++)
    {
      ans = ans * base;
    }
    printf("%d",ans);
  }
  else 
    {
    printf("Wrong input");
  }
    return 0;
}