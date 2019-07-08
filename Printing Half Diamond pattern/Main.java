#include <stdio.h>
int main() {
 int i,j,n,k;
  scanf("%d",&n);
int s;

  for(i=1;i<=n;i++)
  {
    s=i;
    
    
    for(k=1;k<=(n-i);k++)
    {
      printf(" ");
    }
   s=s+(s-1);
    for(j=1;j<=s;j++)
    {
 
      printf("*");
  
 

    }
    printf("\n");
  }
	// Type your code here
	return 0;
}