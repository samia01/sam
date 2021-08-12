#include<stdio.h>
#include<conio.h>
main(){
 int i, n=5;
 int sum=0;
 for(i=1; i<=5; i++){
     if(i%2==0)
     {
       //break;
       continue;
       }
     sum+=i;}
printf("%d",sum);
 }
