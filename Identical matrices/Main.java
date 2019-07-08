#include<stdio.h>
int main()
{
  int r,c;
  scanf("%d",&r);
  scanf("%d",&c);
  int mat[r][c];
  int mat1[r][c];
  int i,j,flag=0;
    
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
      if(mat[i][j]!=mat1[i][j])
      {
        flag=1;
      }
    }
  }
  if(flag==0)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
	//Try out your
  }

	return 0;
}