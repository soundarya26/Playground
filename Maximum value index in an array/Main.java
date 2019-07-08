// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
  
{
  int n,i;
  scanf("%d",&n);
  int arr[n];
  int max=arr[0];
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&arr[i]);
  }
          for(i=0;i<=n-1;i++)
  {
    if(max<arr[i])
    {
      max=arr[i];
    
    }
  }
  printf("%d",i-1);

  // Type your code here 
  
   return 0;
}