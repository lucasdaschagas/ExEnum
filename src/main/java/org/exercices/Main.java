package org.exercices;

import Entities.Department;
import Entities.HourContract;
import Entities.Worker;
import EntitiesEnums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter a department name: ");
        String departmenteName = sc.nextLine();

        System.out.println("Enter a worker name");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary: ");
        Double workerBaseSalary = sc.nextDouble();

        Worker worker = new Worker(WorkerLevel.valueOf(workerLevel), new Department(departmenteName), workerBaseSalary, workerName);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1 ; i < n+1 ; i++) {

            System.out.print("Enter contract #"+ i +" data: " );
            System.out.print("Date (DD/MM/YYYY): ");

                Date contractDate = sdf.parse(sc.next());

                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();

                System.out.print("Duration Hours: ");
                int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate , valuePerHour , hours);

        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (DD/MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.print("Name: " + worker.getName());
        System.out.println();
        System.out.print("Department: " + worker.getDepartment().getName());
        System.out.println();
        System.out.print("Income for " + monthAndYear + ": "+ String.format("%.2f",worker.income(year,month)));
        System.out.println();


    sc.close();

    }
}