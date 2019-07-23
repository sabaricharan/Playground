#include <stdio.h>   
//#include < conio.h > 
#define PI 3.14
int main()   
{  
    float radius, area;  
   // printf("Enter radius of circle\n");  
    scanf("%f", & radius);
  	radius = radius/2;
    area = PI * radius * radius;  
    printf("%0.2f\n", area);  
    //getch();  
    return 0;  
}