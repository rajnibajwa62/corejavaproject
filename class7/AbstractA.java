import java .util.Scanner;
import java.lang.String;
abstract class Animal{
String colour;
String breed;
String name;
void speak(){
System.out.println("they speaking");
}
abstract void eat();
}
class dog extends Animal{
dog(String colour,String breed,String name)
{
this.colour=colour;
this.breed=breed;
this.name=name;
}
void me()
{
System.out.println("colour is:" +colour);
System.out.println("breed is:" +breed);
System.out.println("name is:" +name);
}
void eat()
{
System.out.println("i eats bones");
}
}
class AbstractA{
public static void main(String[] args){
Animal an=new dog("retriever","white","jack");
dog d=new dog("retriever","white","jack");
d.me();
an.eat();
an.speak();
}
}