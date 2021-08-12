#include<stdio.h>
main(){
  int year;
  printf("enter the year:");
  scanf("%d",&year);
  (year%400==0||year%4==0)? printf("yeah! it's a leap year.\n"):printf("nope!\n");//divisible by 100 is not leap year but if the year is also divisible by 400 then it's a leap year
  switch(year%400==0||year%4==0){
  case 1: printf("leap year!");
          break;
  default: printf("nope, it's usual");
           break;

  }
}
