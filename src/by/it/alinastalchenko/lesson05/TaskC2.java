package by.it.alinastalchenko.lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/
public class TaskC2 {
public static void main(String[]args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] array = new Integer[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(Integer[] array)
    {

        Arrays.sort(array, Collections.reverseOrder());

    }
}