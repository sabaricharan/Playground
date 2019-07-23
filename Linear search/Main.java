#include<stdio.h>
int main()
{
  int n,search,arr[20],i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&search);
  for(i=1;i<=n;i++)
  {
    if(arr[i]==search)
    {
      printf("%d",i);
      return 0;
    }
   
  }
  //if(arr[i] == arr[n])
	printf("%d isn't present in the array.",search);
  return 0;
}