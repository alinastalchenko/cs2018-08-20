package by.it.alinastalchenko.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа");
        int a ; int b;
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();


        System.out.print("Sum");
        System.out.print(" = ");
        System.out.println(i);
    }
}





