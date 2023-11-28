package ru.gb.jc.hw3;

abstract class BasicEmployee {
    protected String name;
    protected String surname;
    protected int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3){
            throw new RuntimeException("Некорректное имя работника.");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if (name == null || name.length() < 0){     //Есть фамилия "Ё"
            throw new RuntimeException("Некорректная фамилия работника.");
        }
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age < 18){
            throw new RuntimeException("Некорректный возраст работника.");
        }
        this.age = age;
    }

    protected BasicEmployee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // абстрактный метод для расчёта среднемесячной заработной платы:
    public abstract double calculateSalary();

    public int compareTo(BasicEmployee another) {
        return this.surname.compareTo(another.surname);
    }
}


/*1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой
(один из потомков - Freelancer) и фиксированной оплатой (второй потомок -Worker).
а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.
в) ** Реализовать интерфейсы для возможности сортировки массива/коллекции (обратите ваше внимание на интерфейсы Comparator,
 Comparable), добавьте новое состояние на урове базового типа и создайте свой уникальный компаратор.
г) ** Создать класс, содержащий массив или коллекцию сотрудников (как Worker так и Freelancer), и реализовать
возможность вывода данных с использованием foreach (подсказка: вам потребуется поработать с интерфейсом Iterable).*/