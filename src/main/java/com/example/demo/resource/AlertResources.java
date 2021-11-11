package com.example.demo.resource;

import com.example.demo.model.Alert;
import com.example.demo.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/alert")
public class AlertResources {

    @Autowired
    private AlertService alertService;

    @PostMapping("/saveAlert")
    public String saveAlert(@RequestBody Alert alert) {
        return alertService.saveAlert(alert);
    }

    @GetMapping("/getAlert/{alertId}")
    public Alert getAlert(@PathVariable("alertId") String alertId) {
        return alertService.getAlert(alertId).orElse(null);
    }
}
