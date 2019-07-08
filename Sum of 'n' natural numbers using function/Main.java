#include<stdio.h>
int sumn(int n)
{ int i,sum=0;
 for(i=1;i<=n;i++)
 {
   sum=sum+i;
 }
 return sum;
}
   
   
  
int main() {
    // Type your code here
  int s,sum1;
  scanf("%d",&s);
  sum1=sumn(s);
  printf("%d",sum1);

  	return 0;
}