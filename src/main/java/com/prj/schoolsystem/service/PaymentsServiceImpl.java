package com.prj.schoolsystem.service;

import com.prj.schoolsystem.models.Payments;
import com.prj.schoolsystem.models.Students;
import com.prj.schoolsystem.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentsServiceImpl implements PaymentsService{

    @Autowired
    private PaymentsRepository paymentsRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Payments> findAll() {
        return (List<Payments>) paymentsRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Payments> findById(Long id) {
        return paymentsRepository.findById(id);
    }

    @Override
    @Transactional
    public Payments save(Payments pay) {
        return paymentsRepository.save(pay);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        paymentsRepository.deleteById(id);
    }
}
