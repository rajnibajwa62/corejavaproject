class SubstringsOfAString{
public static void main(String args[]){
String put="abcd";
SubString(put,put.length());
}
public static void SubString(String put,int a){
for(int i=0; i<a; i++){
for(int j=i+1; j<=a; j++){
System.out.println(put.substring(i,j));
}
}
}
}
