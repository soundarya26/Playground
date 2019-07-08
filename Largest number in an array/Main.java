#include<stdio.h>
int main()
{
  int i,arr_s;
  scanf("%d",&arr_s);
  int arr[arr_s];
  for(i=0;i<=arr_s-1;i++)
  {
    scanf("%d",&arr[i]);
  }
  int large=arr[0];
  for(i=0;i<=arr_s-1;i++)
  {
    if(large<arr[i])
    {
      large=arr[i];
      
    }
  
  }
  printf("%d",large);
  //fill the code
  return 0;
}