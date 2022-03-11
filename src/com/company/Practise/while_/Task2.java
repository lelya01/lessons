package com.company.Practise.while_;
// Годовая ставка по вкладу в банке - 7% от суммы.
// Выплата по вкладу производится ежемесячно.
// Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
// А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
public class Task2 {
    public static void main(String[] args) {
        int sum = 20000;
        int month = 9;
        int pay = 0;
        while(sum % 7 > 0){
            pay++;
            System.out.println(pay);

        }

    }
}
