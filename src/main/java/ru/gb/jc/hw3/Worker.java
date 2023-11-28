package ru.gb.jc.hw3;
// Worker: c фиксированной оплатой
// среднемесячная заработная плата = фиксированная месячная оплата
public class Worker extends BasicEmployee{
    private double fixedPayment;
    public Worker (String name,  String surname, int age, double fixedPayment) {
        super(name, surname, age);
        this.fixedPayment  = fixedPayment;
    }

    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(double fixedPayment) {
        if (age < 10000){
            throw new RuntimeException("Фиксированная оплата не может быть меньше 10000");
        }
        this.fixedPayment = fixedPayment;
    }

    public double calculateSalary() {
        return fixedPayment;
    }




}
