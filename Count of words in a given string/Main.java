#include <stdio.h>
#include <string.h>
 
int main()
{
  	char str[100];
  	int i, totalwords;
  	totalwords = 1;
 
  
  	gets(str);
  	 	   	
  	for(i = 0; str[i] != '\0'; i++)
	{
		if(str[i] == ' ' )
		{
			totalwords++;	
		} 
	}	
	printf(" %d",totalwords);
	
  	return 0;
}