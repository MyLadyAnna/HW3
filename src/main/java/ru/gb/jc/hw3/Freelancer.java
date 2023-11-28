package ru.gb.jc.hw3;

// Freelancer: с почасовой оплатой
// среднемесячная заработная плата = 20.8 * 8 * почасовая ставка
public class Freelancer extends BasicEmployee{
    private double hourlyRate;          // часовая ставка

    public Freelancer (String name,  String surname, int age, double hourlyRate) {
        super(name, surname, age);
        this.hourlyRate  = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (age < 50){
            throw new RuntimeException("Часовая ставка не может быть меньше 50");
        }
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }

}
