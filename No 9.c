#include<stdio.h>
#include<conio.h>
main(){
 int m;
 char g;
 printf(" enter marks:");
 scanf("%d",&m);
 switch(m/10){
  case 10:
  case 9: g='A';
         printf("%c",g);
         break;
  case 8: g='B';
         printf("%c",g);
         break;
  case 7: g='C';
         printf("%c",g);
         break;
  case 6: g='D';
         printf("%c",g);
  break;
  default: g='F';
          printf("%c",g);
      break;
 }

 }
