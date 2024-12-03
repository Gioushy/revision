package com.gizasystems.hibernate.Service;

import com.gizasystems.hibernate.Entities.Instructor;

import java.util.List;

public interface InstructorService {
    Instructor findInstructorById(int id);
    List<Instructor> findAllInstructors();
    void saveInstructor(Instructor instructor);
}
