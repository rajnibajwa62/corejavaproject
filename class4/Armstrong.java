import java.util.Scanner;
class Armstrong{
public static void main(String[] args){
int a,b,c=0,original;
Scanner sc;
sc=new Scanner(System.in);
a=sc.nextInt();
original=a;
while(a>0){
b=a%10;
c+=b*b*b;
a=a/10;
}
if(c==original){
System.out.println("the given number is armstrong number");
}
else{
System.out.println("the given number is not a armstrong number");
}
}
}