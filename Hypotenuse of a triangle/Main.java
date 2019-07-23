#include<stdio.h>
#include<math.h>
int main()
{
  float adj,opp;
  scanf("%f%f",&opp,&adj);
  float hyp = (opp * opp) + (adj * adj);
  float ans = sqrt(hyp);
  printf("%.2f",ans);
  return 0;
}