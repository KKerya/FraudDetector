package com.mycompany.fraudapp;

import java.util.List;

class FraudDetector {
    private List<FraudRule> fraudRules = List.of(
        new FraudRule1(),
        new FraudRule2(),
        new FraudRule3(),
        new FraudRule4(),
        new FraudRule5(),
        new FraudRule6()
        );

    FraudDetectionResult isFraud(Transaction transaction) {
        return fraudRules.stream()
                .filter(fraudRule -> fraudRule.isFraud(transaction).getFraud())
                .findFirst()
                .map(this::buildFraudResult)
                .orElse(buildNotFraudResult());
    }

    private FraudDetectionResult buildFraudResult(FraudRule fraudRule){
        return new FraudDetectionResult(true, fraudRule.getRuleName());
    }

    private FraudDetectionResult buildNotFraudResult(){
        return new FraudDetectionResult(false, null);
    }
}

