class Palindrome{
public static void main(String[] args){
int a=2345;
int original=a;
int reverse=0;
int remainder;
while(original>0){
remainder=original % 10;
reverse=reverse*10 + remainder;
original=original/10;
}
if(original==a){
System.out.println(" the number"+reverse+"is palindrome");
}
else{
System.out.println("the number"+reverse+"is not palindrome");
}
}
}