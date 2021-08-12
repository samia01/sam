#include<stdio.h>
#include<conio.h>
main(){
 int num,sum=1, i=0;
 do{
    scanf("%d",&num);
    sum+=num;
 }while(num!=0);
printf("%d",sum);
/*while(i<5){
    printf("*");
    i++;
}*/
}
