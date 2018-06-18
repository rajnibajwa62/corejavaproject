import java.util.Scanner;
class Animal{
String breed;
String colour;
public void speak(){
System.out.println("animals");
}
Animal(String br,String clr){
breed=br;
colour=clr;
}
}
class dog extends Animal
{
public void speak()
{
System.out.println("dog barking");
System.out.println("the dog is" +breed);
System.out.println("colour is" +colour);
}
dog(String br,String clr)
{
super(br,clr);
}
}
class Test{
public static void main(String[] args){
dog d=new dog("labradrown","black");
d.speak();
}
}