#include<stdio.h>
#include<conio.h>
main(){
 int n, f=0;
 scanf("%d",&n);
 for(int i=2; i<n; i++){
    if(n%i==0){
      f=1;
      break;
      }
  }
  if(f==0){
     printf("prime");
     }
  else{
     printf("nope");}
 }
