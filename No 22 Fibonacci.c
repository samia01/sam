#include<stdio.h>
#include<conio.h>
main(){
  int p1,p2,next,n;
  p1=p2=1;
  scanf("%d",&n);
  for(int i=3; i<=n;i++){
    next=p1+p2;
    //printf("%d",next);
    p1=p2;
    p2=next;

  }
  printf("%d", next);
  }
