import java.util.Scanner;
public class ReverseNumber{
public static void main(String[] args){
int a,reverse=0,m,original;
Scanner pq;
pq=new Scanner(System.in);
a=pq.nextInt();
original=a;
while(original !=0){
m=original%10;
reverse=reverse*10+m;
original=original/10;
}
System.out.println(reverse);
}
}

