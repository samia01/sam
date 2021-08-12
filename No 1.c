#include<stdio.h>
#include<conio.h>
#include<Windows.h>
main(){
  int _a,b,c$;
  double d=999999999.9999;
  printf("%lf\n",d);//[checked that can also use %f]
  printf("enter A:");
  //Sleep(500);
  scanf("%i",&_a);
  //Sleep(5000);
  printf("enter B:\n");
  scanf("%d",&b);
  Sleep(500);
  c$=_a+b;
  printf("%d",c$);
  return 0;

  }
