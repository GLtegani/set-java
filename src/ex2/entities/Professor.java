package ex2.entities;

import java.util.HashSet;
import java.util.Set;

public class Professor {
   private final Set<Student> courseA = new HashSet<>();
   private final Set<Student> courseB = new HashSet<>();
   private final Set<Student> courseC = new HashSet<>();

   public Professor() {
   }

   public final Set<Student> getCourseA() {
      return courseA;
   }

   public final Set<Student> getCourseB() {
      return courseB;
   }

   public final Set<Student> getCourseC() {
      return courseC;
   }

   public final void addCourseA(Student studentId) {
      this.courseA.add(studentId);
   }

   public final void addCourseB(Student studentId) {
      this.courseB.add(studentId);
   }

   public final void addCourseC(Student studentId) {
      this.courseC.add(studentId);
   }

   public final Integer totalStudents() {
      Set<Student> total = new HashSet<>();

      total.addAll(this.getCourseA());
      total.addAll(this.getCourseB());
      total.addAll(this.getCourseC());

      return total.size();
   }
}
