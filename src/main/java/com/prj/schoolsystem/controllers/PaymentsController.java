package com.prj.schoolsystem.controllers;

import com.prj.schoolsystem.models.Payments;
import com.prj.schoolsystem.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pagos")
public class PaymentsController {

    @Autowired
    private PaymentsService paymentsService;

    @GetMapping
    public List<Payments> findAll(){
        return paymentsService.findAll();
    }

}
