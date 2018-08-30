package by.it.alinastalchenko.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
            ArrayList<Integer> mainList = new ArrayList<Integer>();
            ArrayList<Integer> x3List = new ArrayList<Integer>();
            ArrayList<Integer> x2List = new ArrayList<Integer>();
            ArrayList<Integer> otherList = new ArrayList<Integer>();

            initializeList(mainList);

            for (int i = 0; i < mainList.size(); i++)
            {
                int x = mainList.get(i);

                if (x % 3 == 0)
                    x3List.add(x);
                if (x % 2 == 0)
                    x2List.add(x);
                else if (x % 3 != 0 && x % 2 != 0)
                    otherList.add(x);
            }

            printList(x3List);
            printList(x2List);
            printList(otherList);

        }

        public static void initializeList(ArrayList<Integer> list) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 20; i++)
                list.add(Integer.parseInt(reader.readLine()));
        }

        public static void printList(List<Integer> list)
        {
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i));
        }
    }


