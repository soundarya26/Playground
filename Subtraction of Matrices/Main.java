#include<stdio.h>
int main()
{
  int r,c,i,j;
  scanf("%d",&r);
  scanf("%d",&c);
  int mat[r][c];
  int mat1[r][c];
  int sub[r][c];
      
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
      scanf("%d",&mat1[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      sub[i][j]=mat[i][j]-mat1[i][j];
    }
  }
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      printf("%d ",sub[i][j]);
    }
     printf("\n");
   }

	//Try out your code here
	return 0;
}