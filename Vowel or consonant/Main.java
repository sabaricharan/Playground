#include<stdio.h>
int main()
{
 char a;
  int lower,upper;
  scanf(" %c ",&a);
  lower = (a == 'a' || a == 'e' || a == 'i'  || a == 'o' || a == 'u');
  upper = (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U');
  if (upper || lower)
  {
    printf("Vowel");
  }
  else
    printf("Consonant");
    
}