#include<stdio.h>
#include<string.h>
#include<conio.h>
main(){
 char s[100], t;
 char *p, *q;
 p=&s[0];
 gets(s);
 int l= strlen(s);
 q = &s[l-1];
 while(q>p){
   t=*p;
   *p=*q;
   *q=t;
   q--;
   p++;
 }
 puts(s);
 }
