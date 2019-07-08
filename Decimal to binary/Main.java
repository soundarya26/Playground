#include<stdio.h>
int main()
{
  int n,arr[1000],r=0,i;
  scanf("%d",&n);
  while(n!=0)
  {
    arr[r++]=n%2;
    n=n/2;
  }
  for(i=r-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  
  //Type your code here
  return 0;
}