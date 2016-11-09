package com.idea.nursing.food.web.domain.vo;

/**
 * Created by 10238 on 2016/11/9.
 */
public class SelectVOWeekFood {

    private Integer week;
    private String year;


    @Override
    public String toString() {
        return "SelectVOWeekFood{" +
                "week=" + week +
                ", year='" + year + '\'' +
                '}';
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
