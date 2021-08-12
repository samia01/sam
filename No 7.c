#include<stdio.h>
main(){
 int a,b,max=0;
 printf("enter a & b:");
 scanf("%d %d",&a,&b);
 if(a>b){
    max=a;
 }
 else{
    max=b;
 }
 printf("maximum is : %d ",max);
 }
