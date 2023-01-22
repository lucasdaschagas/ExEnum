package Entities;

import EntitiesEnums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private WorkerLevel level;
    private Department department;
    private Double baseSalary;
    private String name;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}
    public Worker(WorkerLevel level, Department department, Double baseSalary, String name){
        this.baseSalary =baseSalary;
        this.department = department;
        this.level = level;
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContracts(HourContract contract){
        contracts.add(contract);
    }
    public void removeContracts(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        Calendar cal = Calendar.getInstance();
        Double sum = baseSalary;

        for ( HourContract c : contracts ) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);

            if (year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
            return sum;
    }
}
