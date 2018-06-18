import java.util.Scanner;
import java.lang.String;
class StringNumber{
public static void main(String[] args){
Scanner sc;
sc=new Scanner(System.in);
System.out.println("enter three string number as input");
String a=sc.next();
String b=sc.next();
String o=sc.next();
int num1=Integer.valueOf(a);
int num2=Integer.valueOf(b);
int num3=Integer.valueOf(o);
int sum=num1+num2+num3;
System.out.println("result is :"+sum);
if(Integer.valueOf(a)>Integer.valueOf(b)){
System.out.println("the greatest number is"+a);
}
else{
System.out.println("the greatest number is"+b);
}
}
}