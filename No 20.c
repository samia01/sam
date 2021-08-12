#include<stdio.h>
#include<conio.h>
main(){
  int i, min, a, b, g;
  scanf("%d",&a);
  scanf("%d",&b);
  min=(a<b)?a:b;
  for(i=min; i>0; i--){
    if((a%i==0)&&(b%i==0)){
        g=i;
        printf("%d",g);
        break;
    }
  }
  }
