import java.util.Scanner;
public class VowelsRemove{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter any string");
String inputString=sc.nextLine();
String newInputString=inputString.replaceAll("[AEIOUaeiou]","");
System.out.println("string without vowels");
System.out.println(newInputString);
sc.close();
}
}