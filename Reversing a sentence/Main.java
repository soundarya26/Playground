#include<stdio.h>
#include<string.h>
#define MAX_SIZE 100
int main()
{
  char str[100],reverse[100];
  int len,i,index,wordstart,wordend;
  gets(str);
  len=strlen(str);
  index=0;
  wordstart=len-1;
  wordend=len-1;
  while(wordstart>0)
  {
    if(str[wordstart]==' ')
    {
      i=wordstart+1;
      while(i<=wordend)
      {
        reverse[index]=str[i];
        i++;
        index++;
      }
      reverse[index++]=' ';
      wordend=wordstart-1;
    }
    wordstart--;
  }
  for(i=0;i<=wordend;i++)
  {
    reverse[index]=str[i];
    index++;
  }
  reverse[index]='\0';
  printf("%s",reverse);
  return 0;
    
  // Type your code here

}