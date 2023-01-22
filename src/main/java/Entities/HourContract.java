package Entities;

import java.util.Date;

public class HourContract {
    private Date hour;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){}

    public HourContract(Date hour, Double valuePerHour, Integer hours){
        this.hour = hour;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
