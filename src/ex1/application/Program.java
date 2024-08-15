package ex1.application;

import ex1.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter file full path: ");
      String path = sc.nextLine();

      try (BufferedReader br = new BufferedReader(new FileReader(path))) {
         Set<LogEntry> set = new HashSet<>();

         String line = br.readLine();

         while (line != null) {
            String[] fields = line.split(" ");
            String username = fields[0];
            Instant moment = Instant.parse(fields[1]);

            set.add(new LogEntry(username, moment));
            line = br.readLine();
         }
         System.out.printf("Total users: %s", set.size());

      } catch (IOException e) {
         System.err.println("Error: " + e.getMessage());
      }



      sc.close();
   }
}
