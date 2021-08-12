#include<stdio.h>
#include<conio.h>
main(){
  int p1=0,p2,next,n;
  p2=1;
  scanf("%d",&n);
  for(int i=1; i<=n;i++){
    printf("%d",p1);
    next=p1+p2;
    //printf("%d",next);
    p1=p2;
    p2=next;

  }

  }
