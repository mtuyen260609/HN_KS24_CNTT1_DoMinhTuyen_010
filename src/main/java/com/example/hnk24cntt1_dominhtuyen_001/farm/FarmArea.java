package com.example.hnk24cntt1_dominhtuyen_001.farm;

public class FarmArea {

    private final String id;
    private final String name;
    private final String terrainType;

    public FarmArea(String id, String name, String terrainType) {
        this.id = id;
        this.name = name;
        this.terrainType = terrainType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTerrainType() {
        return terrainType;
    }
}
