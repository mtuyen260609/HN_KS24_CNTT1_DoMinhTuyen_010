package com.example.hnk24cntt1_dominhtuyen_001.farm;

public class RiceTerracesStrategy implements MaintenanceStrategy {

    @Override
    public double calculateCost(FarmArea farm, int durationInMonths) {
        System.out.println("Đang tính phụ phí bảo trì trạm bơm áp suất cao cho ruộng bậc thang...");
        return durationInMonths * 2500000;
    }
}
