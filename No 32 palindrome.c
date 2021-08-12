#include<stdio.h>
#include<conio.h>
main(){
  char s[80], t[80];
  gets(s);
  int i, f=0,j;
  j= strlen(s)-1;
  i=0;
  while(j>=0){//cause value of i is changing that's why we can't use i instead of 0
    t[j]=s[i];
    j--;
    i++;
  }
  for(i=0; i<strlen(s);i++){
    if(s[i]!= t[i]){
        f=1;
        break;
    }

  }
if(f==0){
    printf("palindrome!");
  }
else{
    printf("nope");
  }
  }
