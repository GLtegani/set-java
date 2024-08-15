package ex2.application;

import ex2.entities.Professor;
import ex2.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      Professor professor = new Professor();
      System.out.print("How many students for course A? ");
      int n = sc.nextInt();
      sc.nextLine();
      for(int i = 0; i < n; i++) {
         professor.addCourseA(new Student(sc.nextInt()));
         sc.nextLine();
      }

      System.out.print("How many students for course B? ");
      n = sc.nextInt();
      sc.nextLine();
      for(int i = 0; i < n; i++) {
         professor.addCourseB(new Student(sc.nextInt()));
         sc.nextLine();
      }

      System.out.print("How many students for course C? ");
      n = sc.nextInt();
      sc.nextLine();
      for(int i = 0; i < n; i++) {
         professor.addCourseC(new Student(sc.nextInt()));
         sc.nextLine();
      }
      System.out.print("Total students: " + professor.totalStudents());

      sc.close();
   }
}
