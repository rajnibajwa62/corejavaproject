import java.util.*;
class SubArray{
public static int lengthArray(int arr[],int n){
int max=1;
int l=1,i;
for(i=1;i<n;i++){
if(arr[i]>arr[i-1])
l++;
else
{
if(max<1)
max=1;
l=1;
}
}
if(max<l)
max=l;
return max;
}
public static void main(String[] args)
{
int arr[]={8,6,5,4,0,8,2,1};
int n=arr.length;
System.out.println("length="+lengthArray(arr,n));
}
}