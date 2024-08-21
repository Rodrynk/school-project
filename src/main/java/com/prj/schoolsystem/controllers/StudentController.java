package com.prj.schoolsystem.controllers;

import com.prj.schoolsystem.models.Students;
import com.prj.schoolsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Students> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> show(@PathVariable Long id){
         Optional<Students> optional = studentService.findById(id);
         if(optional.isPresent()){
             return ResponseEntity.ok(optional.orElseThrow());
         }
         return ResponseEntity.notFound().build();
    }

    @PostMapping("/matricula")
    public ResponseEntity<?> create(@RequestBody Students students){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.save(students));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Students students, @PathVariable Long id){
        Optional<Students> o = studentService.findById(id);
        if (o.isPresent()){
            Students s1 = o.orElseThrow();
            s1.setStudent(students.getStudent());
            s1.setBirth(students.getBirth());
            s1.setParents(students.getParents());
            s1.setMonthly_payment(students.getMonthly_payment());
            return ResponseEntity.status(HttpStatus.CREATED).body(studentService.save(s1));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remove(@PathVariable Long id){
        Optional<Students> o = studentService.findById(id);
        if (o.isPresent()){
            studentService.remove(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
