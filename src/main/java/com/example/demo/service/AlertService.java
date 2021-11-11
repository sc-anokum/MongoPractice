package com.example.demo.service;

import com.example.demo.model.Alert;
import com.example.demo.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlertService {

    @Autowired
    private AlertRepository alertRepository;

    public String saveAlert(Alert alert){
        return alertRepository.save(alert).getAlertID();
    }

    public Optional<Alert> getAlert(String alertId){
        return alertRepository.findById(alertId);
    }


}
