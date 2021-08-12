#include<stdio.h>
#include<conio.h>
main(){
  int i,n;
  scanf("%d",&n);
  for(i=1; i<=n; i++){
        printf(" ");
    for(int j=n; j>=i; j--){
        printf("*");
    }
    printf("\n");
  }

  }

