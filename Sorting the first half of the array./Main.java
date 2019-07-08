#include<stdio.h>
int main()
{
  int size,t,i,j;
  scanf("%d",&size);
  int arr[size];
  for(i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<size/2;i++)
  {
    for(j=i+1;j<size/2;j++)
    {
      if(arr[i]>arr[j])
      {
t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
      }
    }
  }
  for(i=0;i<size;i++)
  {
    printf("%d ",arr[i]);
  }

	//Try out your code here
	return 0;
}