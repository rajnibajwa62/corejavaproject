import java.io.*;
import java.util.*;

class Datefor{
public static void main(String[] args){

HashMap <Integer,String> rd= new HashMap<Integer,String> ();
rd.put(01,"one");
rd.put(02,"two");
rd.put(03,"three");
rd.put(04,"four");
rd.put(05,"five");
rd.put(06,"six");
rd.put(07,"seven");
rd.put(8,"eight");
rd.put(9,"nine");
rd.put(10,"ten");
rd.put(11,"eleven");
rd.put(12,"twelve");
rd.put(13,"thirteen");
rd.put(14,"fourteen");
rd.put(15,"fifteen");
rd.put(16,"sixteen");
rd.put(17,"seventeen");
rd.put(18,"eighteen");
rd.put(19,"nineteen");
rd.put(20,"twenty");
rd.put(21,"twenty-one");
rd.put(22,"twenty-two");
rd.put(23,"twenty-three");
rd.put(24,"twenty-four");
rd.put(25,"twenty-five");
rd.put(26,"twenty-six");
rd.put(27,"twenty-seven");
rd.put(28,"twenty-eight");
rd.put(29,"twenty-nine");
rd.put(30,"thirty");
rd.put(31,"thirty-one");

HashMap<Integer,String>  mn=new HashMap<Integer,String> ();
mn.put(01,"january");
mn.put(02,"february");
mn.put(03,"march");
mn.put(04,"april");
mn.put(05,"may");
mn.put(06,"june");
mn.put(07,"july");
mn.put(	8,"august");
mn.put(9,"september");
mn.put(10,"october");
mn.put(11,"november");
mn.put(12,"december");

HashMap<Integer,String>  yr= new HashMap<Integer,String> ();
yr.put(2011,"two thousand and eleven");
yr.put(2012,"two thousand and twelve");
yr.put(2013,"two thousand and thirteen");
yr.put(2014,"two thousand and fourteen");
yr.put(2015,"two thousand and fifteen");
yr.put(2016,"two thousand and sixteen");
yr.put(2017,"two thousand and seventeen");
yr.put(2018,"two thousand and eighteen");
Scanner sc=new Scanner(System.in);
System.out.println("enter the date :");
String date=sc.next();
int str=Integer.parseInt(date.substring(0,2));
int str1=Integer.parseInt(date.substring(3,5));
int str2=Integer.parseInt(date.substring(6));
System.out.println(rd.get(str)+" "+mn.get(str1)+" "+yr.get(str2));
}
}