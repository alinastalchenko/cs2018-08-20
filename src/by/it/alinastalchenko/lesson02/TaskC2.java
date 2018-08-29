package by.it.alinastalchenko.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        dec (a,b);
        bin(a,b);
        hex (a,b);
        oct (a,b);
        String ah =Integer.toHexString(a);
        String bh = Integer.toHexString(b);
        String sh =Integer.toHexString(a+b);
        System.out.println("HEX:"+ah+"+"+bh+"="+sh);

        String ao =Integer.toOctalString(a);
        String bo = Integer.toOctalString(b);
        String so =Integer.toOctalString(a+b);
        System.out.println("OCT:"+ao+"+"+bo+"="+so);
            }
private static void bin (int a, int b) {
        String ab = Integer.toBinaryString(a);
        String bb =Integer.toBinaryString(b);
}
}
