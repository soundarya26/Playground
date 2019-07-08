#include<stdio.h>
#include<string.h>
#define MAX_SIZE 100
int countoccurences(char * str,char * tosearch);
void upper_string(char s[])
{
  int c=0;
  while(s[c]!='\0')
  {
    if(s[c]>='a'&&s[c]<='z')
    {
      s[c]=s[c]-32;
    }
    c++;
  }
}
int main()
{
 char str[MAX_SIZE];
  char tosearch[MAX_SIZE];
  int count;
  scanf("%[^\n]s",str);
  upper_string(str);
  scanf("%s",tosearch);
  upper_string(tosearch);
  count=countoccurences(str,tosearch);
  printf("%d",count);
  return 0;
}
  //Type your code here
  int countoccurences(char * str,char * tosearch)
  {
    int i,j,found,count;
    int stringlen,searchlen;
    stringlen=strlen(str);
    searchlen=strlen(tosearch);
    count=0;
    for(i=0;i<=stringlen-searchlen;i++)
    {
      found=1;
      for(j=0;j<searchlen;j++)
      {
        if(str[i+j]!=tosearch[j])
        {
          found=0;
          break;
        }
      }
      if(found==1)
      {
        count++;
      }
    }
  return count;
}