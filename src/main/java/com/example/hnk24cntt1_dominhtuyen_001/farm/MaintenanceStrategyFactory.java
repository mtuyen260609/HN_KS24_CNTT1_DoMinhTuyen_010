package com.example.hnk24cntt1_dominhtuyen_001.farm;

import java.util.HashMap;
import java.util.Map;

public class MaintenanceStrategyFactory {

    private final Map<String, MaintenanceStrategy> strategies = new HashMap<>();

    public MaintenanceStrategyFactory() {
        strategies.put("RICE_TERRACES", new RiceTerracesStrategy());
        strategies.put("STRAWBERRY_GREENHOUSE", new StrawberryGreenhouseStrategy());
        strategies.put("FRUIT_ORCHARD", new FruitOrchardStrategy());
        // Đăng ký Strategy mới
        strategies.put("GINSENG_VALLEY", new GinsengValleyStrategy());
    }

    public MaintenanceStrategy getStrategy(String terrainType) {
        MaintenanceStrategy strategy = strategies.get(terrainType);

        if (strategy == null) {
            throw new RuntimeException("Loại hình canh tác này chưa được hệ thống IoT hỗ trợ");
        }

        return strategy;
    }
}
