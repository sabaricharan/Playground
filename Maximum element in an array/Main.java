#include<stdio.h>
int main()
{
  	int n,i,arr[30],temp=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++)
  {
    if(arr[i] >= arr[i+1])
    {
      arr[i+1]=arr[i];
      temp = arr[i+1];
    }
  }
  printf("%d",temp);
}
