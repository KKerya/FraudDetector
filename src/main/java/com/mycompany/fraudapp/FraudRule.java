package com.mycompany.fraudapp;

interface FraudRule {
    FraudDetectionResult isFraud(Transaction transaction);

    String getRuleName();

}
