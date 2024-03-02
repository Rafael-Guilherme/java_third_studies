import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Tv");
        hashSet.add("Notebook");
        hashSet.add("Tablet");

        hashSet.removeIf(x -> x.length() >= 3);

        for (String p : hashSet) {
            System.out.println(p);
        }

        System.out.println();
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Tv");
        treeSet.add("Notebook");
        treeSet.add("Tablet");

        System.out.println(treeSet.contains("Notebook"));

        for (String p : treeSet) {
            System.out.println(p);
        }

        System.out.println();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Tv");
        linkedHashSet.add("Notebook");
        linkedHashSet.add("Tablet");

        System.out.println(linkedHashSet.contains("Notebook"));

        for (String p : linkedHashSet) {
            System.out.println(p);
        }
    }
}
