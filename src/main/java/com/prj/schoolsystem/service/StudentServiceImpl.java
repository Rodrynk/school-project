package com.prj.schoolsystem.service;

import com.prj.schoolsystem.models.Students;
import com.prj.schoolsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Students> findAll() {
        return (List<Students>) studentRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Students> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    @Transactional
    public Students save(Students user) {
        return studentRepository.save(user);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        studentRepository.deleteById(id);
    }

}
