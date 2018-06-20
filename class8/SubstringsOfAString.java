import java.util.Scanner;
class SubstringsOfAString{
public static void main(String args[]){
String String,sub;
int i,c,length;
Scanner in=new Scanner(System.in);
System.out.println("enter a string to print it's all substring");
string=in.nextline();
length=string.length();
System.out.println("Substrings of \""+string+"\" are:");
for(c=0; c<length; c++)
{
for(i=1; i<=length-c; i++)
{
sub=string.substring(c,c+i);
System.out.println(sub);
}
}
}
}