package com.example.hnk24cntt1_dominhtuyen_001.farm;

public class FarmMaintenanceService {

    private final MaintenanceStrategyFactory strategyFactory;

    public FarmMaintenanceService(MaintenanceStrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    public Invoice calculateMaintenanceCost(FarmArea farm, int durationInMonths) {

        System.out.println("Bắt đầu tính toán chi phí bảo trì hệ thống cho khu vực: " + farm.getName());

        MaintenanceStrategy strategy =
                strategyFactory.getStrategy(farm.getTerrainType());

        double baseCost = strategy.calculateCost(farm, durationInMonths);

        return new Invoice(
                farm.getId(),
                baseCost,
                "CALCULATED"
        );
    }
}
