#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<windows.h>
main(){
 char s[90];
 int c=0, i=0;
 gets(s);
 while(s[i]!='\0'){
    c++;
 i++;
 }
 printf("%d",c);
 }
