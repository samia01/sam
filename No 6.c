#include<stdio.h>
main(){
    float x=5.2;
    int y= round(x);
    int z=ceil(x);
    int s=floor(x);
    int c = (int)(x+.5);
    int b =(int)(x);
    int a = (int)(x+1);
    float e=5/3;
    float g=5.0/3.0;
    int f=5/3;
    int w=5.0/3.0;
    printf("%f\n",g);
    printf("%d\n",f);
    printf("%d\n",w);
    printf("%f\n",e);
    printf("%d\n",y);
    printf("%d\n",z);
    printf("%d\n",s);
    printf("%d\n",c);//there is no nearest
    printf("%d\n",b);//floor
    printf("%d\n",a);//ceil

  }
