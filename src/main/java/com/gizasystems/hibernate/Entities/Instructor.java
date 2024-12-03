package com.gizasystems.hibernate.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
    private int instructorId;

    @Column(name = "name")
    private String instructorName;

    @Column(name = "email")
    private String instructorEmail;

    @Column(name = "details_id")
    private int instructorDetails;
}
