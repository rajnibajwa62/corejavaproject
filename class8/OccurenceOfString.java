import java.util.Scanner;
class OccurenceOfString{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String abc=sc.nextLine();
String abc1=sc.nextLine();
if(abc.contains(abc1)==true)
{
System.out.println("abc contains abc1");
}
else{
System.out.println("abc not contains abc1");
}
}
}