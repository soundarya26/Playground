#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  int i,c,j;
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  c=1;
  for(i=0;i<n;i++)
  {
    if((arr[i]==1)&&(arr[i+1]==1))
    {
      c=c+1;
    }
  }
  printf("%d",c);
  
  //Type your code here
  return 0;
}