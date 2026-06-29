package com.example.hnk24cntt1_dominhtuyen_001.farm;

public class FruitOrchardStrategy implements MaintenanceStrategy {

    @Override
    public double calculateCost(FarmArea farm, int durationInMonths) {
        System.out.println("Đang tính chi phí kiểm tra đường ống tưới nhỏ giọt cơ bản...");
        return durationInMonths * 1000000;
    }
}
