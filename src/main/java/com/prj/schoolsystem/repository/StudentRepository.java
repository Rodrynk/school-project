package com.prj.schoolsystem.repository;

import com.prj.schoolsystem.models.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Students, Long> {

}
