#include <stdio.h>
int gcd(int n,int m,int k)
{int min,gcd1,gcd2;
  if(n>m)
  {
    return min=m;
  }
  else
  {
    return min=n;
  }
  while(min>=1)
  {
    if((n%min==0)&&(m%min==0))
    {
      gcd1=min;
      break;
    }
    min--;
  }
  if(k>m)
  {
    return min=m;
  }
  else
  {
    return min=k;
  }
  while(min>=1)
  {
    if((k%min==0)&&(m%min==0))
    {
      gcd2=min;
      break;
    }
    min--;
  }
  return gcd2;
}
int main() {
  int q,w,r,sum;
  scanf("%d %d %d",&q,&w,&r);
  sum=gcd(q,w,r);
  printf("%d",sum);
  
	//Type your code here
	return 0;
}