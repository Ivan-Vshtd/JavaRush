package com.javarush.test.level29.lesson15.big01.human;

public class Worker extends Human{
    private double salary;
    private String company;

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }



    public Worker(String name, int age)
    {
        super(name,age);
    }

    @Override
    public void live() {
        live();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}