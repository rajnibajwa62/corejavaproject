class Revers {
public static void main(String[] args){
int a=234;
int original=a;
int m=0;
int remainder;
while(original !=0){
remainder=original%10;
m=m*10+remainder;
original=original/10;
}
System.out.println("star of the number is"+m);
}
}