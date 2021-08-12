#include<stdio.h>
//#include<conio.h>
//#include<math.h>
main(){
  int d1,d2,d3,d4,a,r;
  printf("enter a: ");
  scanf("%d",&a);
  d4=a%10;
  a=a/10;
  d3=a%10;
  a=a/10;
  d2=a%10;
  a=a/10;
  d1=a%10;
  a=a/10;
  r=(d4*1000)+(d3*100)+(d2*10)+d1;
  printf("reversed number: %d",r);

  }
