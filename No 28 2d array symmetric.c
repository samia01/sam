#include<stdio.h>
#include<conio.h>
main(){
 int n,f=0;
 scanf("%d",&n);
 int a[n][n];
 for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        scanf("%d",&a[i][j]);
    }
 }
 for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
       if(a[i][j]!=a[j][i]){
        f=1;
       }
    }
 }
 if(f==0){
    printf("symmetric matrix");
 }
 else{
    printf("asymmetric matrix");
 }
 }
