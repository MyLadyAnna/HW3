package ru.gb.jc.hw3;

import java.util.Comparator;

public class EmpSureNameComparator implements Comparator<BasicEmployee> {
    public int compare(BasicEmployee e1, BasicEmployee e2) {
        return e1.getSurname().compareTo(e2.getSurname());
        //return e1.surname.length() - e2.surname.length();
    }
}
