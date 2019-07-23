#include <stdio.h>
int main() {
	
  char s;
  scanf(" %c",&s);
  if(s >= 'a' && s <= 'z')
    s = s - 32;
  else
    s = s + 32;
  printf("%c",s);
	return 0;
}