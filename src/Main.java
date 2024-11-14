
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        System.out.println(" Введите в консоли выражение соответствующему типу: Х_+_Y.\n " +
                "Числа X и Y от 0 до 10.\n " +
                "Вместо знака _ пробел.");

        Scanner console = new Scanner(System.in);
        ParsingData.parsingString(console.nextLine());

        try {
            switch (ParsingData.arephmeticOperator) {
                case "+":
                    result = ParsingData.valueFirsUser + ParsingData.valueSecondUser;
                    System.out.println(result);
                    break;
                case "-":
                    result = ParsingData.valueFirsUser - ParsingData.valueSecondUser;
                    System.out.println(result);
                    break;
                case "*":
                    result = ParsingData.valueFirsUser * ParsingData.valueSecondUser;
                    System.out.println(result);
                    break;
                case "/":
                    result = ParsingData.valueFirsUser / ParsingData.valueSecondUser;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Оператор не верный");
            }
        } catch (RuntimeException e) {
        }


    }
}