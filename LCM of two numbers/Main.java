// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
 int num1,num2,i,ans = 1,n,lcm;
  scanf("%d%d",&num1,&num2);
  int temp1,temp2;
  temp1=num1;
  temp2=num2;
  if(num1>num2)
    n = num1;
  else
    n = num2;
  for(i = 1; i < n ; i++)
  {
    if (num1%i == 0)
    {
      if (num2%i == 0)
      {
        ans = ans * i;
        num1=num1/i;
        num2=num2/i;
      }
    }
  }
  lcm = (temp1*temp2)/ans;
  printf("%d",lcm);


   return 0;
}
