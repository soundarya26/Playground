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
  int s,s1;
  scanf("%d %d",&s,&s1);
  int e=-1,e1=-1;
  for(i=0;i<=arr_s-1;i++)
  {
    if(s==arr[i])
    {
      e=i;
    }
    if(s1==arr[i])
    {
      e1=i;
    }
  }
  printf("%d\n",e);
  printf("%d",e1);
  //Type your code here
  return 0;
}