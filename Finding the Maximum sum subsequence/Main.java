#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[20];
  int i,j;
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  printf("%d",sum(arr,n));
  //Type your code here
  return 0;
}
int sum(int arr[],int n)
{
  int run,max,i;
  run=arr[0];
  max=arr[0];
  for(i=1;i<n;i++)
  {
    if(arr[i]>arr[i-1])
    {
      run=run+arr[i];
    }
    else
    {
      run=arr[i];
    }
    if(run>max)
    {
      max=run;
    }
  }
  return max;
}