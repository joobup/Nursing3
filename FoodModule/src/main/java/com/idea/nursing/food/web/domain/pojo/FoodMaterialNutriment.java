package com.idea.nursing.food.web.domain.pojo;

public class FoodMaterialNutriment {
    private Long id;

    private Long materialId;

    private Long nutrimentId;

    private Byte nutrimentValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Long getNutrimentId() {
        return nutrimentId;
    }

    public void setNutrimentId(Long nutrimentId) {
        this.nutrimentId = nutrimentId;
    }

    public Byte getNutrimentValue() {
        return nutrimentValue;
    }

    public void setNutrimentValue(Byte nutrimentValue) {
        this.nutrimentValue = nutrimentValue;
    }
}