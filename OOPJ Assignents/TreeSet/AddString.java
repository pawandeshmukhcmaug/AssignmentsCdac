import java.util.TreeSet;

public class AddString {
    public static void main(String[] args) {
	TreeSet <String> colors = new TreeSet<>();
     colors.add("green");
     colors.add("red");
     colors.add("blue");
     colors.add("orange");
     System.out.println(colors);
     TreeSet <String> colors2 = new TreeSet<>();
       colors2.add("mango");
       colors2.add("grapes");
       colors2.add("berry");
     colors.addAll(colors2);
     System.out.println(colors);
     System.out.println(colors.descendingSet());
     System.out.println(colors.first());
     System.out.println(colors.last());
    TreeSet<Integer> set = new TreeSet<>();
    set.add(10);
    set.add(20);
    set.add(30);
     System.out.println(set.ceiling(25));
     System.out.println( colors.ceiling("red"));
    }
}