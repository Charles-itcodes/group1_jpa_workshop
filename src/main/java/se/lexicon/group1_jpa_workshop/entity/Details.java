package se.lexicon.group1_jpa_workshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;


@Entity
public class Details {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int detailsId;
        private String email;
        private String name;
        private LocalDate birthDate;

        public Details() {
        }

        public Details(int detailsId, String email, String name, LocalDate birthDate) {
                this.detailsId = detailsId;
                this.email = email;
                this.name = name;
                this.birthDate = birthDate;
        }

        public int getDetailsId() {
                return detailsId;
        }

        public void setDetailsId(int detailsId) {
                this.detailsId = detailsId;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public LocalDate getBirthDate() {
                return birthDate;
        }

        public void setBirthDate(LocalDate birthDate) {
                this.birthDate = birthDate;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Details)) return false;
                Details details = (Details) o;
                return Objects.equals(getEmail(), details.getEmail()) && Objects.equals(getName(), details.getName()) && Objects.equals(getBirthDate(), details.getBirthDate());
        }

        @Override
        public int hashCode() {
                return Objects.hash(getEmail(), getName(), getBirthDate());
        }

        @Override
        public String toString() {
                return "Details{" +
                        "detailsId=" + detailsId +
                        ", email='" + email + '\'' +
                        ", name='" + name + '\'' +
                        ", birthDate=" + birthDate +
                        '}';
        }
}
