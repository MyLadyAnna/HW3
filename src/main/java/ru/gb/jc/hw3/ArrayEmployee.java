package ru.gb.jc.hw3;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEmployee {
    private BasicEmployee[] employees;

    public ArrayEmployee(BasicEmployee[] employees) {
        this.employees = employees;
    }

    // сортировка по имени
    public void sortByName() {
        Arrays.sort(employees, Comparator.comparing(BasicEmployee::getName));
    }

    // сортировка по фамилии
    public void sortBySureName() {
        Arrays.sort(employees, Comparator.comparing(BasicEmployee::getSurname));
    }

    // сортировка по возрасту
    public void sortByAge() {
        Arrays.sort(employees, Comparator.comparing(BasicEmployee::getAge));
    }

    // сортировка по зп
    public void sortByAverageSalary() {
        Arrays.sort(employees, Comparator.comparing(BasicEmployee::calculateSalary));
    }

    // вывод
    public void printWorkersInfo() {
        for (BasicEmployee employee : employees) {
            System.out.println("Name: " + employee.getName() + " " + employee.getSurname() + ", " + employee.getAge() + " years old. " + "Average Salary: " + employee.calculateSalary());
        }
    }
}
