package com.gizasystems.hibernate.Controllers;


import com.gizasystems.hibernate.Entities.Instructor;
import com.gizasystems.hibernate.Exception.InstructorNotFoundException;
import com.gizasystems.hibernate.Service.InstructorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructors")
public class InstructorController {
    private InstructorService instructorService;
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }


    @GetMapping()
    public ResponseEntity<List<Instructor>> getAllInstructors() {
       return ResponseEntity.ok(instructorService.findAllInstructors());
    }


    @GetMapping("/{instructorID}")
    public ResponseEntity<Instructor> getInstructorById(@PathVariable int instructorID) {
        Instructor instructor = instructorService.findInstructorById(instructorID);
        if (instructor == null) {
            throw new InstructorNotFoundException();
        } else {
            return ResponseEntity.ok(instructor);
        }
    }

    @PostMapping()
    public ResponseEntity<Instructor> createInstructor(@RequestBody Instructor instructor) {
        instructorService.saveInstructor(instructor);
        return ResponseEntity.ok(instructor);
    }

}
