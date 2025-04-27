package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CalculatingMyMoneyTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/calculating.csv")
    void calculate(int expected,int income, int expenses, int threshold) {
        CalculatingMyMoney calculating = new CalculatingMyMoney();
        int actual = calculating.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected,actual);
    }
}