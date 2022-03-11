package com.company.Practise.while_;
// Годовая ставка по вкладу в банке - 7% от суммы.
// Выплата по вкладу производится ежемесячно.
// Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
// А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
public class Task2 {
    public static void main(String[] args) {
        double sum = 20000;
        int month = 12;
        int percents = 7;
        double percentsPerMonth = percents / 12.0;

        int i = 0;
        while(i < month){
            sum += sum / 100 * percentsPerMonth;
            i++;
        }
        System.out.println(sum);
    }
}
