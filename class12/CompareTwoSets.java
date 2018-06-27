import java.util.*;
class CompareTwoSets{
 public static void main(String[] args) {
	  HashSet<String> mh = new HashSet<String>();
      mh.add("Rass");
      mh.add("Pinku");
      mh.add("Rajni");
      mh.add("Shalu");
      mh.add("Monika");
      mh.add("Purnima");
      HashSet<String> subset = new HashSet<String>();
      subset.add("Zoya");
      subset.add("Rass");
      subset.add("Vidhi");
      subset.add("Shalu");
      subset.add("Manpreet");
      subset.add("Sheetal");
      mh.retainAll(subset);
      System.out.println(mh);

}
}