package com.gizasystems.hibernate.Repository;

import com.gizasystems.hibernate.Entities.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Integer> {
}
