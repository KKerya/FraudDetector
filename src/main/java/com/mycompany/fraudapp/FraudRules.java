package com.mycompany.fraudapp;

class FraudRule1 implements FraudRule {
    @Override
    public FraudDetectionResult isFraud(Transaction transaction){
        return new FraudDetectionResult(transaction.getTrader().getFullName().equals("Pokemon"), "FrandRule1");
    }

    @Override
    public String getRuleName() {
        return "FraudRule1";
    }
}

class FraudRule2 implements FraudRule {
    @Override
    public FraudDetectionResult isFraud(Transaction transaction){
        return new FraudDetectionResult(transaction.getAmount() > 1_000_000, "FrandRule2");
    }

    @Override
    public String getRuleName() {
        return "FraudRule2";
    }
}

class FraudRule3 implements FraudRule{
    @Override
    public FraudDetectionResult isFraud(Transaction transaction){
        return new FraudDetectionResult(transaction.getTrader().getCity().equals("Sydney"), "FrandRule3");
    }

    @Override
    public String getRuleName() {
        return "FraudRule3";
    }
}

class FraudRule4 implements FraudRule {
    @Override
    public FraudDetectionResult isFraud(Transaction transaction){
        return new FraudDetectionResult(transaction.getTrader().getCountry().equals("Jamaica"), "FrandRule4");
    }

    @Override
    public String getRuleName() {
        return "FraudRule4";
    }
}

class FraudRule5 implements FraudRule {
    @Override
    public FraudDetectionResult isFraud(Transaction transaction){
        return new FraudDetectionResult( transaction.getTrader().getCountry().equals("Germany") && transaction.getAmount() > 1000, "FrandRule5");
    }

    @Override
    public String getRuleName() {
        return "FraudRule5";
    }
}

class FraudRule6 implements FraudRule
{
    @Override
    public FraudDetectionResult isFraud(Transaction transaction){
        return new FraudDetectionResult(transaction.getTrader().getMaxTransactionAmount() < transaction.getAmount(), "FrandRule6");
    }

    @Override
    public String getRuleName() {
        return "FraudRule6";
    }
}
