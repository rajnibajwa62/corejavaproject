import java.util.Arrays;

public class ArrayPrint{
 
public static <E> void printArray(E[] ArrayPrint ) {
for (E element : ArrayPrint )
System.out.printf("%s ", element);
System.out.println();
}

public static void main(String args[]) {
  

Double[] dblArray = { 2231.5,234.5,675.3,123.8};

Integer[] intArray = { 0,2,4,6,8,9};
Character[] charArray = {'r','a','j','n','i'};

System.out.println(" integerArray contains:");
printArray(intArray);

System.out.println("\n doubleArray contains:");
printArray(dblArray);
 
System.out.println("\n characterArray contains:");
printArray(charArray);

} 
}