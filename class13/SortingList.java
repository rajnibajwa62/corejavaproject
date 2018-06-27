import java.util.*;  
import java.io.*; 

 class Labour{ 
String name;  
int age;  
Labour(String name,int age){  
this.name=name;  
this.age=age;   
}  
}

 


class AgeComparator implements Comparator<Labour>{  
public int compare(Labour la1,Labour la2){  
if(la1.age==la2.age)  
return 0;  
else if(la1.age>la2.age)  
return 1;  
else  
return -1;  
}  
}  


class NameComparator implements Comparator<Labour>{  
public int compare(Labour la1,Labour la2){  
return la1.name.compareTo(la2.name);  
}  
}  

 class SortingList{ 
public static void main(String args[]){  
  
ArrayList<Labour> sl=new ArrayList<Labour>();  
sl.add(new Labour("Ram",20));  
sl.add(new Labour("Sham",22));  
sl.add(new Labour("Rajkumar",21));
 
  
System.out.println("Sort by name:----  ");  
  
Collections.sort(sl,new NameComparator());  
for(Labour la: sl){  
System.out.println(la.name+" "+la.age);  
}  
  
System.out.println("sort by age:----  ");  
  
Collections.sort(sl,new AgeComparator());  
for(Labour la: sl){  
System.out.println(la.name+" "+la.age);  
}  
  
}  
}  