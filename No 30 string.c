#include<stdio.h>
#include<conio.h>
#include<string.h>
main(){
 char a[20], t[20];
 //scanf("%s",a);
 gets(a);
 gets(t);
 puts(a);
 int l=strlen(a);
 printf("%d\n",l);
 printf("%s\n",strupr(a));
 printf("%s\n",strlwr(a));
 strupr(a);
 int n=strcmp(a,t);
 printf("%d",n);
 strcpy(a,t);
 puts(t);
 }
