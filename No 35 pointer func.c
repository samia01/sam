#include<stdio.h>
#include<conio.h>

void swap(int *p, int *q){
   int t;
   t=*p;
   *p=*q;
   *q=t;};
main(){
 int x=25, y=20;
 //int *p, *q;
 swap(&x,&y);
 printf("%d %d",x,y);
        }
