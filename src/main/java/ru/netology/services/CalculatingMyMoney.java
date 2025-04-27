package ru.netology.services;

public class CalculatingMyMoney {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        System.out.println("Начальные параметры:");
        System.out.println("Доход от работы: " + income);
        System.out.println("Обязательные траты: " + expenses);
        System.out.println("Порог для отдыха: " + threshold);
        System.out.println("\nМесячный отчёт:");

        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц " + month + ". Денег " + money + ". ");

            if (money >= threshold) {
                // Отдых
                count++;
                System.out.println("Буду отдыхать.");
                System.out.print("Потратил -" + expenses);
                money -= expenses;
                int vacationExpenses = (money * 2) /3; // Траты на отдых = 2/3 от остатка
                System.out.println(", затем ещё -" + vacationExpenses);
                money -= vacationExpenses; // Остается 1/3
            } else {
                // Работа
                System.out.println("Придётся работать.");
                System.out.print("Заработал +" + income);
                money += income;
                System.out.println(", потратил -" + expenses);
                money -= expenses;
            }

            System.out.println("Остаток: " + money + "\n");
        }

        System.out.println("Итого месяцев отдыха: " + count);
        return count;
    }
}