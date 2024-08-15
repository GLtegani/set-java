package ex2.entities;

import java.util.Objects;

public class Student {
   private final Integer id;

   public Student(Integer id) {
      this.id = id;
   }

   public final Integer getId() {
      return id;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Student student = (Student) o;
      return Objects.equals(getId(), student.getId());
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(getId());
   }
}
