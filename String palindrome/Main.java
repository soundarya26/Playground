#include<stdio.h>
#include<string.h>
int main()
{
 char str[100];
  
  scanf("%s",str);
  int len=strlen(str);
  int i,flag=1;
  for(i=0;i<len;i++)
  {
    if(str[i]!=str[len-i-1])
    {
      flag=0;
    }
  }
  if(flag==1)
  {
    printf("%s is a palindrome",str);
  }
  else
  {
    printf("%s is not a palindrome",str);
  }


  //Type your code here
  return 0;
}