#include<stdio.h>
#include<string.h>
int main()
{
  char a[100];
  int len;
  gets(a);
  len = strlen (a);
  printf(" %d",len);
  
  return 0;
}