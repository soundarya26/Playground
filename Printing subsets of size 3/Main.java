#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,j,k;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<=n-2;i++)
  {
    for(j=i+1;j<=n-1;j++)
    {
      for(k=j+1;k<=n-1;k++)
      {
        printf("(%d, %d, %d) ",arr[i],arr[j],arr[k]);
      }
    }
    printf("\n");
  }


  return 0;
}