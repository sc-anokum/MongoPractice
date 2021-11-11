package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@Document
public class Alert {

    @Id
    private String alertID;
    private String alertName;
    private String alertType;
    private String alertCategory;
    private String deviceID;
    private String severity;
    private long consecutiveOccurrence;
    private float confidenceScore;
    private String confidenceLevel;
    private long deviceCreatedOn;
    private long createdOn;
    private long resolvedOn;
    private long eventStart;
    private long eventEnd;
    private String status;
    private String productType;
    private long acknowledgedOn;
    private String acknowledgedBy;
    private String acknowledgedType;
    private String description;
    private String notes;
    private ArrayList<AlertRuleField> rules;
    private boolean resolved;
    private boolean updation;
    private boolean newAlertCreation;
    private boolean sendAlert;
}
