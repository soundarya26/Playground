
#include<stdio.h>
int main()
{
  int r,c;
  scanf("%d",&r);
  scanf("%d",&c);
  int mat[r][c];
 
  int i,j;
    
  for(i=0;i<r;i++)
  { 
    for(j=0;j<c;j++)
    {
      scanf("%d",&mat[i][j]);
    }
  }
  for(i=r-1;i>=0;i--)
  {
    for(j=0;j<=c-1;j++)
    {
      printf("%d ",mat[j][i]);
    }
    printf("\n");
  }
}