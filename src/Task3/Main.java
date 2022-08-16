package Task3;

public class Main {
    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        int result = add.calculate(100, 20);
        System.out.println(result);
        int result2 = sub.calculate(100, 20);
        System.out.println(result2);
        int result3 = mul.calculate(100, 20);
        System.out.println(result3);
        int result4 = div.calculate(100, 20);
        System.out.println(result4);
    }
}

interface Calculator {
    int calculate(int x, int y);
}
