#include<stdio.h>
#include<conio.h>
main(){
  int i, max, a, b, g;
  scanf("%d",&a);
  scanf("%d",&b);
  max=(a<b)?a:b;
  while(1){
    if((max%a==0)&&(max%b==0)){
        g=max;
        printf("%d",g);
        break;
    }
    max++;
  }

  }
