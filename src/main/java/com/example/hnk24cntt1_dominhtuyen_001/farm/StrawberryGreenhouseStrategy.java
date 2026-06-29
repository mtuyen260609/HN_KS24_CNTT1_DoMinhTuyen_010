package com.example.hnk24cntt1_dominhtuyen_001.farm;

public class StrawberryGreenhouseStrategy implements MaintenanceStrategy {

    @Override
    public double calculateCost(FarmArea farm, int durationInMonths) {
        System.out.println("Đang tính chi phí hiệu chuẩn cảm biến nhiệt đới và hệ thống phun sương...");
        return durationInMonths * 4000000;
    }
}
