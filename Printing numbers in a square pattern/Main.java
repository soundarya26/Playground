#include <stdio.h>
int main(){
	// Type your code here
  int n,i,j,num=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      printf("%d",num);
    }
    printf("\n");
    num=num+1;
  }
      
  	return 0;
}