package com.example.cmmsiboot.Services;

public class Equipments {
    private int equipmentId;
    private String equipmentName;

    public Equipments() {
    }

    public Equipments(int equipmentId, String equipmentName) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }
}
