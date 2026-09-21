import java.util.ArrayList;
import java.util.Collections;
public class AddString {
 public static void main(String[] args) {
	 ArrayList<String> list = new ArrayList<>();
	 
	 list.add("pawan");
	 list.add("raj");
	 list.add("tribhu");
	 list.add("om");
	 list.add("omkar");
	 
	 list.add(0, null);
	 System.out.println(list);
	
	 // seting and getting element
	 list.set(0, "pallavi");
	 System.out.println(list);
	 System.out.println(list.get(1));
	 // remove 
	 list.remove(3);
	 System.out.println(list);
	 // contain
	 System.out.println(list.contains("pawan"));

	 // sorting arraylist
	 Collections.sort(list);
	 System.out.println(list );
	 ArrayList<String> list2 = new ArrayList<String>(list);
 
	 // copy in another array
	 Collections.copy(list, list2);
	  System.out.println("after : "+list2);
	  
	  // Suffle the array list
	 Collections.shuffle(list2);
	 System.out.println("Suffled : "+list2);
	 
	 // reverse the elements \
	 Collections.reverse(list);
	 System.out.println(list);
 }
}
