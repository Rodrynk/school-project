package com.prj.schoolsystem.repository;

import com.prj.schoolsystem.models.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payments, Long> {
}
