#include<stdio.h>
#include<conio.h>
int prime(int n);
main(){
    int n;
    scanf("%d",&n);
    int f=prime(n);
    if(f==0){
        printf("prime");
    }
    else{
        printf("non prime");
    }

 }
int prime(int n){
  int i, f;
  for(i=2;i<n/2;i++){
    if(n%i==0){
        f= 0;
    }
    else{
      f= 1;
    }
  }
  return f;
  }
