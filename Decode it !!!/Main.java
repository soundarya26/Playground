#include<stdio.h>
#include<string.h>
int main()
{
	//Your Code here!!
  char str[100];
  scanf("%[^\n]s",str);
  int len=strlen(str);
  int key;
  scanf("%d",&key);
  key=key%26;
  int i,c;
  for(i=0;i<len;i++)
  {
    c=str[i];
    if(c>='a'&&c<='z')
    {c=c-key;
     if(c<'a')
     {
      c=c+'z'-'a'+1;
    }
    str[i]=c;
    }
    else if(c>='A'&&c<='Z')
    {
     c=c-key;
     if(c<'A')
     {
      c=c+'Z'-'A'+1;
    }
    str[i]=c;
    }
    }
    printf("%s",str);
    

  
  return 0;
}