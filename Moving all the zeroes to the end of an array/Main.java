#include<stdio.h>
int main()
{
  int i,count=0;
  int n;
  scanf("%d",&n);
  int arr[20];
  for(int i=0;i<=n-1;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++)
  {
    if(arr[i]>0)
    {
      arr[count++]=arr[i];
    }
  }
  while(count<n)
  {
    arr[count++]=0;
  }
  for(i=0;i<n;i++)
  {
    printf("%d ",arr[i]);
  }
  
  
  
  //Type your code here
  return 0;
}