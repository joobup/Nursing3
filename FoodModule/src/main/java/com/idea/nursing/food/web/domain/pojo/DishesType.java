package com.idea.nursing.food.web.domain.pojo;

public class DishesType {
    private Long id;

    private String dishesTypeName;

    private Byte dishesTypeLeave;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDishesTypeName() {
        return dishesTypeName;
    }

    public void setDishesTypeName(String dishesTypeName) {
        this.dishesTypeName = dishesTypeName == null ? null : dishesTypeName.trim();
    }

    public Byte getDishesTypeLeave() {
        return dishesTypeLeave;
    }

    public void setDishesTypeLeave(Byte dishesTypeLeave) {
        this.dishesTypeLeave = dishesTypeLeave;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}