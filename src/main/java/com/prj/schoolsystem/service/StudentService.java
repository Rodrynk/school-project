package com.prj.schoolsystem.service;

import com.prj.schoolsystem.models.Students;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Students> findAll();

    Optional<Students> findById(Long id);

    Students save(Students user);

    void remove(Long id);
}
