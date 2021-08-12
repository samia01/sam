#include<stdio.h>
#include<conio.h>
main(){
  int i=1;
  int n=4;
  int sum=1;
  int mul=1;
  int x;
  printf("enter n");
  scanf("%d",&n);
  scanf("%d",&x);
  for(i=1;i<=n;i++){
      sum=sum*i;

  }
  for(i=1;i<=n;i++){
    mul=mul*x;
  }
  printf("%d\n",sum);
  printf("%d\n",mul);
  getch();
 // clrscr();
      }
