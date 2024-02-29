import java.util.Arrays;
import java.util.List;

public class ProgramCuringa {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myString = Arrays.asList("Maria", "Alex", "Bob");
        printList(myString);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
