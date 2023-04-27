package org.example.accounting.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity(name = "accounting")
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Accounting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Embedded
    Car car;

    @Column(name = "release_year")
    int releaseYear;

    @Embedded
    Owner owner;

    @Column(name = "reg_number")
    String regNumber;

    long pts;

    @Column(name = "pts_date")
    Date ptsDate;

    long sts;

    @Column(name = "sts_date")
    Date stsDate;

    @Override
    public String toString() {
        return "Accounting{" +
                "id=" + id +
                ", car=" + car.getBrand()  + ", " + car.getGeneration() + ", " + car.getModel() +
                ", releaseYear=" + releaseYear +
                ", owner=" + owner.getFirstName()+", "+ owner.getSecondName() + ", "+ owner.getLastName() + ", " + owner.getBirthday() +", " +
                ", regNumber='" + regNumber + '\'' +
                ", pts=" + pts +
                ", ptsDate=" + ptsDate +
                ", sts=" + sts +
                ", stsDate=" + stsDate +
                '}';
    }
}
