package by.it.alinastalchenko.lesson03;

/*
Lesson 03. Конвертер температуры

Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32) * 5/9

Пример:
В метод convertCelsiumToFahrenheit на вход подается значение 40.

Пример вывода:
104.0


Требования:
1. Метод convertCelsiumToFahrenheit(int) должен быть не приватным и статическим.
2. Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
3. Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
4. Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия
в градусы Фаренгейта и возвращать это число.*/


class TaskC1 {

    public static double convertCelsiumToFahrenheit(int TC) {
        //напишите тут ваш код
        double TF;
        TF = TC * 9/5 + 32;
        return TF;
    }
}



//    public static void main(String[] args) {
//        System.out.println(convertCelsiumToFahrenheit(40));
//    }

}
