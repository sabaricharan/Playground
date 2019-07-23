#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c,root1,root2,real,img,d;
  scanf("%f%f%f",&a,&b,&c);
  d = (b*b) - (4*a*c);
  if (d>0)
  {
    root1 = (-b+sqrt(d))/(2*a);
    root2 = (-b-sqrt(d))/(2*a);
    printf("root1 = %.2f  root2 = %.2f",root1,root2);
  }
  else if(d==0)
  {
    root1 = root2 = -b / (2*a);
    printf("root1 = %.2f  root2 = %.2f",root1,root2);
  }
  else
 {
    real = -b/(2*a);
   img = sqrt(-d)/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,img,real,img);
  }
  //ans = (-b + ((sqrt (b*b) - (4 * a *c) )));
 //ans2 = (-b - ((sqrt (b*b) - (4 * a * c) )));
 //root1 = ans / 2* a;
 //root2 = ans2 / 2*a;
 //printf("%.2f\t%.2f",root1,root2);
}