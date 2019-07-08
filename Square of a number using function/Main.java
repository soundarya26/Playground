#include<stdio.h>

int square(int n)
{
  int sqr;
  sqr=n*n;
return sqr;
}

int main() {
  int m,sqr1;
  scanf("%d",&m);
  sqr1=square(m);
  printf("%d",sqr1);
   // Type your code here
   return 0;
}