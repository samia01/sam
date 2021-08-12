#include<stdio.h>
#include<conio.h>
//#include<math.h>
main(){
  int i,n;
  scanf("%d",&n);
  for(i=1; i<=n; i++){
    for(int j=i; j<n; j++){
        printf(" ");
    }
    for(int j=1; j<=i; j++){
        printf("*");
    }
    //printf("*");
    printf("\n");

  }

  }
