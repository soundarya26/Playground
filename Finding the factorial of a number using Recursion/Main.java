#include<stdio.h>
int main()
{
	//Try out your code here
  int i,n;
  scanf("%d",&n);
  int fact=1;
  for(i=1;i<=n;i++)
  {
  fact=fact*i;
  }
  printf("%d",fact);
	return 0;
}