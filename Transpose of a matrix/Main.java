#include<stdio.h>
int main()
{
  int r,c,i,j;
  scanf("%d",&r);
  scanf("%d",&c);
  int mat[r][c];
  int mat1[c][r];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&mat[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      mat1[j][i]=mat[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      printf("%d ",mat1[i][j]);
    }
    printf("\n");
  }
  
  //Type your code here
  return 0;
}