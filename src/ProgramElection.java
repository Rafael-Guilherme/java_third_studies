import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramElection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> votes = new HashMap<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String username = fields[0];
                int vote = Integer.parseInt(fields[1]);

                if (votes.containsKey(username)) {
                    int votesSofar = votes.get(username);
                    votes.put(username, vote + votesSofar);
                } else {
                    votes.put(username, vote);
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
