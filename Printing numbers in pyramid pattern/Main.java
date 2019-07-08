#include <stdio.h>
int main() {
  int i,j,k;
  int n,num=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n-i;j++)
    {
      printf(" ");
    }
    for(k=1;k<=i;k++)
    {
      printf("%d ",num);
    num=num+1;
    }
    printf("\n");
  }
	// Type your code here
	return 0;
}