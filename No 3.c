#include<stdio.h>
main(){
 int h1,m1,h2,m2,h3,m3,diff;
 printf("enter time of first city (h:m)");
 scanf("%d%d", &h1,&m1);
 printf("enter time of second city (h:m)");
 scanf("%d%d", &h2,&m2);
 diff = (h1*60+m1)-(h2*60+m2);
 /*h3=diff/60;
 m3=diff%60;*/
 if(diff>0){
   h3=diff/60;
   m3=diff%60;}
 else {
    h3=(-diff)/60;
    m3=(-diff)%60;
 }

 printf("difference %d hours %d minutes",h3,m3);




}
