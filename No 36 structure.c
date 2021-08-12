#include<stdio.h>
#include<string.h>
#include<conio.h>
struct student{
 char name[20];
 int id;
 int m;
 float gpa;

 };
main(){
    struct student S[50];
    for(int i=0; i<7; i++){
        gets(S[i].name);
    }
    int a=45;
    float b;
    b=(float)a;
    printf("%f",b);
    printf(strupr(S[0].name));

}
