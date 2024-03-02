import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramCourses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.err.print("How many students for course A? ");
        int nA = sc.nextInt();

        for (int i = 0; i < nA; i++) {
            int n = sc.nextInt();
            set.add(n);
        }

        System.err.print("How many students for course B? ");
        int nB = sc.nextInt();

        for (int i = 0; i < nB; i++) {
            int n = sc.nextInt();
            set.add(n);
        }

        System.err.print("How many students for course C? ");
        int nC = sc.nextInt();

        for (int i = 0; i < nC; i++) {
            int n = sc.nextInt();
            set.add(n);
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
