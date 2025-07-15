package secao17.exc_MAP.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> election = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String itemCVS = br.readLine();
            while (itemCVS != null){
                String[] fields = itemCVS.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (election.containsKey(name)) {
                    int votesSoFar = election.get(name);
                    election.put(name, votes + votesSoFar);
                } else {
                    election.put(name,votes);
                }
                itemCVS = br.readLine();
            }

            for (String key : election.keySet()){
                System.out.printf("%s: %s\n", key, election.get(key) );
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            sc.close();
        }

    }
}
