class NumberCount{
public static void main(String[] args){
String abc="i learn java";
int count=1;
for(int i=0; i<abc.length()-1;i++){
if(abc.charAt(i)==' ' &&(abc.charAt(i+1)!=' ')){
count++;
}
}
System.out.print("numbers of word is:="+count);
}
}