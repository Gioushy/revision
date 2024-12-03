package com.gizasystems.hibernate.Service.Impl;

import com.gizasystems.hibernate.Entities.Instructor;
import com.gizasystems.hibernate.Exception.InstructorNotFoundException;
import com.gizasystems.hibernate.Repository.InstructorRepository;
import com.gizasystems.hibernate.Service.InstructorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {

    private InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public Instructor findInstructorById(int id) {
        Instructor instructor = instructorRepository.findById(id).orElseThrow(()-> new InstructorNotFoundException("Customer not found"));
        System.out.println(instructor);
        return instructor;
    }

    @Override
    public List<Instructor> findAllInstructors() {
        List<Instructor> instructorList = (List<Instructor>) instructorRepository.findAll();
        return instructorList;
    }

    @Override
    public void saveInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
    }
}
