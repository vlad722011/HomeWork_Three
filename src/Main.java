import pair.Pair;
import calculator.Calculator;

public class Main {
    public static void main(String[] args) {

        /*
        1. Написать класс Калькулятор (необобщенный), который содержит обобщенные
        статические методы: sum(), multiply(), divide(), subtract().
        Параметры этих методов – два числа разного типа, над которыми должна быть
        произведена операция.
        */

        System.out.println("Задача один:");

        System.out.println(Calculator.sum(3.1, 23456789789L));
        System.out.println(Calculator.subtract(123.0f, 2L));
        System.out.println(Calculator.multiply(5, 3));
        System.out.println(Calculator.divide((byte) 1, 0.2));


    /*
      2. Напишите обобщенный метод compareArrays(), который принимает два массива
      и возвращает true, если они одинаковые, и false в противном случае.
      Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
      элементы одного типа.
     */

        System.out.println("Задача два:");

        System.out.println("Сравниваем массивы чисел: ");
        Number[] arr1 = new Number[]{1, 7, 9, 11, -13, 2L, 3f};
        Number[] arr2 = new Number[]{4, -15L, 1700.23f};
        System.out.println(compareArrays(arr1, arr2));


        System.out.println("Сравниваем массивы строк: ");
        String [] arr3 = new String []{"arg1", "arg2", "arg2"};
        String [] arr4 = new String []{"arg1", "arg2", "arg3"};
        System.out.println(compareArrays(arr3, arr4));


    /*
      3. Напишите обобщенный класс Pair, который представляет собой пару значений разного
      типа. Класс должен иметь методы getFirst(), getSecond() для получения значений
      каждого из составляющих пары, а также переопределение метода toString(),
      возвращающее строковое представление пары.
     */

        System.out.println("Задача три:");

        Pair<Integer, String> pair = new Pair<>(1, "argument_two");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);

    }

    private static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].getClass().getName().equals(arr2[i].getClass().getName())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}