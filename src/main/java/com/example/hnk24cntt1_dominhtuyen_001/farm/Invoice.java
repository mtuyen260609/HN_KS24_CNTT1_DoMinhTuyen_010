package com.example.hnk24cntt1_dominhtuyen_001.farm;

public class Invoice {

    private final String farmId;
    private final double amount;
    private final String status;

    public Invoice(String farmId, double amount, String status) {
        this.farmId = farmId;
        this.amount = amount;
        this.status = status;
    }

    public String getFarmId() {
        return farmId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "farmId='" + farmId + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
