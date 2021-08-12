#include<stdio.h>
#include<math.h>
main(){
 float b,b1,b2,bn,r;
 int n;
 printf("enter balance:");
 scanf("%f",&b);
 printf("enter rate:");
 scanf("%f",&r);
 b1=b*(1+(r/100));
 b2=b1*(1+(r/100));
 printf("enter years:");
 scanf("%d",&n);
 bn=b*pow((1+(r/100)),n);
 printf("%f %f %f",b1,b2,bn);
}

