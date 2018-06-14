import java.util.Scanner;
class PrimeNumber{
public static void main(String[] args){
int c=0;
int n;
Scanner sc;
sc=new Scanner(System.in);
n=sc.nextInt();

for(int i=2; i<=n; i++){

for(int j=1; j<=i/2; j++){
c++;
break;
}
}
if(c==1){
System.out.println("prime no");
}
}
}
