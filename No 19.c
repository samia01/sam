#include<stdio.h>
#include<conio.h>
main(){
 int sum=0;
 int num;
 scanf("%d",&num);
 for(int i=1; i<=num/2; i++){
     if(num%i==0){
      sum+=i;
     }
     }
 if(sum==num){
   printf("perfect number!");
 }
 else{
   printf("you did a boo boo!");
 }
 }
