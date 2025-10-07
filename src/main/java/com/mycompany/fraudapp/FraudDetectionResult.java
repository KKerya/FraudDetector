package com.mycompany.fraudapp;

class FraudDetectionResult {
    private final boolean fraud;
    private final String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName){
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean getFraud() { return fraud; }
    public String getRuleName() { return ruleName; }
}
