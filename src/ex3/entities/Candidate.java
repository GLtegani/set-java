package ex3.entities;

import java.util.Objects;

public class Candidate {
   private final String name;
   private Integer votes;

   public Candidate(String name, Integer votes) {
      this.name = name;
      this.votes = votes;
   }

   public final String getName() {
      return name;
   }

   public final Integer getVotes() {
      return votes;
   }

   public final void addVotes(Integer votes) {
      this.votes += votes;
   }

   @Override
   public final boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Candidate candidate = (Candidate) o;
      return Objects.equals(getName(), candidate.getName());
   }

   @Override
   public final int hashCode() {
      return Objects.hashCode(getName());
   }


}
