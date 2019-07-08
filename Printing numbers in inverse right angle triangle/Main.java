#include <stdio.h>
int main() {
  int i,j,k;
  int n;
  scanf("%d",&n);
  int num=n;
  for(i=1;i<=n;i++)
  {
    for(j=num;j>=1;j--)
   {
  
      printf("%d",j);
      
    }
    num=num-1;
  
    printf("\n");
  }
    
    // Type your code here
	return 0;
}