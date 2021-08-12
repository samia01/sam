#include<stdio.h>
#include<conio.h>
int fact(int n);
main(){
int f;
f=fact(5);
printf("%d",f);
}
int fact(int n){
int x;
  if(n==1){
     x=1;
  }
  else{
    x=n*fact(n-1);
  }
  return x;
     }
