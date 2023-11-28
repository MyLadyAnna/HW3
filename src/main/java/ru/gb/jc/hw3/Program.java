package ru.gb.jc.hw3;

public class Program {
    public static void main(String[] args) {
        BasicEmployee[] employees = new BasicEmployee[5];
        employees[0] = new Freelancer("Ivanov", "Ivan", 18, 110);
        employees[1] = new Freelancer("Petrov", "Petr", 20, 120);
        employees[2] = new Worker("Sidorov", "Vladimir", 22, 11000);
        employees[3] = new Worker("Vasileva", "Vlada", 24, 15000);
        employees[4] = new Worker("Korolev", "Nikolay", 26, 20000);


        // Создание объекта класса WorkersArray
        ArrayEmployee empArray = new ArrayEmployee(employees);

        // Сортировка массива работников по имени
        empArray.sortByName();
        System.out.println("Сортировка по имени:");
        empArray.printWorkersInfo();


        System.out.println();
        // Сортировка массива по фамилии
        empArray.sortBySureName();
        System.out.println("Сортировка по фамилии:");
        empArray.printWorkersInfo();

        System.out.println();
        // Сортировка массива по возрасту
        empArray.sortByAge();
        System.out.println("Сортировка по возрасту:");
        empArray.printWorkersInfo();

        System.out.println();
        // Сортировка массива по ЗП
        empArray.sortByAverageSalary();
        System.out.println("Сортировка по зарплате:");
        empArray.printWorkersInfo();
    }
}











