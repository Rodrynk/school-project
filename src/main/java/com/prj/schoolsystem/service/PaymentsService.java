package com.prj.schoolsystem.service;

import com.prj.schoolsystem.models.Payments;
import java.util.List;
import java.util.Optional;

public interface PaymentsService {

    List<Payments> findAll();

    Optional<Payments> findById(Long id);

    Payments save(Payments pay);

    void remove(Long id);
}
