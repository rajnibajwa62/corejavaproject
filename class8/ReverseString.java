import java.lang.*;
import java.io.*;
import java.util.*;
class ReverseString{
public static void main(String[] args){
int reverse=0;
String str="Nitin";
reverse=reverse + reverseString(str);
System.out.println("the reversed String is:"+reverse);
}
public String reverseString(String str)
{
if(str[]==0)
return str;
else
return reverseString (str.subString(1))+str.charAt(0);
}
}