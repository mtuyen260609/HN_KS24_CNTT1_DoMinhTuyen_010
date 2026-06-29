package com.example.hnk24cntt1_dominhtuyen_001.farm;

public class GinsengValleyStrategy implements MaintenanceStrategy {

    @Override
    public double calculateCost(FarmArea farm, int durationInMonths) {
        System.out.println("Đang tính chi phí bảo trì hệ thống tưới thông minh cho vườn sâm thung lũng...");
        return durationInMonths * 5000000;
    }
}
