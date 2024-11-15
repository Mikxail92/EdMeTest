
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""

                Введите в консоль вырожение по аналоги:
                первая цифра(от 1 до 10 включительно),пробел,арефметический оператор(+,-,*,/),пробел,вторая цифра(от 1 до 10 включительно).""");
        Scanner console = new Scanner(System.in);
        ParsingData.parsingString(console.nextLine());

        if (ParsingData.flag) {
            int result;
            switch (ParsingData.arephmeticOperator) {
                case "+" -> {
                    result = ParsingData.valueFirsUser + ParsingData.valueSecondUser;
                    System.out.println("Результат = " + result);
                }
                case "-" -> {
                    result = ParsingData.valueFirsUser - ParsingData.valueSecondUser;
                    System.out.println("Результат = " + result);
                }
                case "*" -> {
                    result = ParsingData.valueFirsUser * ParsingData.valueSecondUser;
                    System.out.println("Результат = " + result);
                }
                case "/" -> {
                    result = ParsingData.valueFirsUser / ParsingData.valueSecondUser;
                    System.out.println("Результат = " + result);
                }
                default -> System.out.println("Арефметический оператор не верный");
            }
        }

    }
}
//}