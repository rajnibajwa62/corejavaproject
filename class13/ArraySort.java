import java.io.*;
import java.util.Arrays;

class ArraySort{
public static<G> void printArray(G[] arr){
for(G r: arr)
System.out.printf("%s",r);
System.out.println();
}
public static void main(String[] args){

String[] Name = {"rajni", "shalu", "juice"};
Arrays.sort(Name);
System.out.println(Arrays.toString(Name));


Integer[] Number = {653,763,123,456};
Arrays.sort(Number);
System.out.println(Arrays.toString(Number));


double[] lengths = {698.0, 234.5, 340.0, 7.0, 6.4};
Arrays.sort(lengths);
System.out.println(Arrays.toString(lengths));
}
}