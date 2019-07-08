#include<stdio.h>
int anu(int b,int e)
{
 int power=1;
  while(e>0)
  {
    power=power*b;
    e--;
  }
  return power;
}
  
  
int main(){
  int r,s,raghu;
  scanf("%d %d",&r,&s);
  raghu=anu(r,s);
  printf("%d ",raghu);
    // Type your code here
  	return 0;
}