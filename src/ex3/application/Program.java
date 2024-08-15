package ex3.application;

import ex3.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter file full path: ");
      String path = sc.nextLine();
      try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
         String line = bufferedReader.readLine();
         Map<Candidate, Candidate> candidateMap = new HashMap<>();

         while (line != null) {
            String[] parts = line.trim().split(",");
            String name = parts[0];
            Integer votes = Integer.parseInt(parts[1]);

            Candidate candidate = new Candidate(name, votes);
            if(candidateMap.containsKey(candidate)) {
               candidateMap.get(candidate).addVotes(candidate.getVotes());
            } else {
               candidateMap.put(candidate, candidate);
            }

            line = bufferedReader.readLine();
         }

         for(Candidate c : candidateMap.keySet()) {
            System.out.println(c);
         }

      } catch (IOException e) {
         System.err.print("Error:" + e.getMessage());
      }


      sc.close();
   }
}
