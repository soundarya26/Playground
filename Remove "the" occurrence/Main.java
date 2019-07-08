#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%[^\n]s",str);
  int len=strlen(str);
  int index=0;
  int i;
 char j[len];
 
  for(i=0;str[i]!='\0';i++)
  {
    if ((str[i]=='T'||'t')&&str[i+1]=='h'&&str[i+2]=='e')
    {
      i=i+3;
    }
    else
    {
      j[index]=str[i];
      index++;
    }
  }
    j[index]='\0';
    printf("%s",j);
  
	//Try out your code here
	return 0;
}