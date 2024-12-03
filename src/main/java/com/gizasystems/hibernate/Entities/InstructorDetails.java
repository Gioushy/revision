package com.gizasystems.hibernate.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class InstructorDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "details_id")
    private int detailsId;

    @Column(name = "phone_number")
    private String phoneNumber;


    @Column(name = "address")
    private String address;
}
