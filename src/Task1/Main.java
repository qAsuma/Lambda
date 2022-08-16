package Task1;
//Создать список и заполнить рандомными числами 10 ячеек, нужно вывести сумму квадратов всех элемента списка.
// Мы используем метод map() для возведения в квадрат каждого элемента, а потом применяем метод reduce() для свертки всех элементов в одно число.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);
        numbers.add(14);
        numbers.add(16);
        numbers.add(18);
        numbers.add(20);

        //2
        List<Integer> numbers1 = Arrays.asList(2,4,6,8,10,12,14,16,18,20);




       // 1
        int s = numbers.stream()
                .mapToInt(num -> (int) Math.pow(num, 2))
                .reduce(0, Integer::sum);

        System.out.println(s);

        //2
        int s1 = numbers1.stream()
                .mapToInt(num -> (int) Math.pow(num, 2))
                .reduce(0, Integer::sum);

        System.out.println(s1);


    }

}
