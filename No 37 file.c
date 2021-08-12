#include<stdio.h>
#include<stdlib.h>
main(){
FILE *fp;
char s[90];
int a=90;
fp=fopen("test.txt","w");
if(fp==0){
    printf("erroer opening file");
    return;
}
printf("enter");
fgets(s, 20, stdin);
fprintf("%d",a);
fclose(fp);

         }
