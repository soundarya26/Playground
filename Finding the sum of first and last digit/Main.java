#include <stdio.h>
int main() {
	//Type your code
  int num,sum=0,first,last;
  scanf("%d",&num);
  last=num%10;
  first=num;
  while(num>=10)
  {
   
   num=num/10;
  }
    first=num;
  sum=first+last;
  printf("%d",sum);
	return 0;
}