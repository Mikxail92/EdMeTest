
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""

                ������� � ������� ��������� �� �������:
                ������ �����(�� 1 �� 10 ������������),������,�������������� ��������(+,-,*,/),������,������ �����(�� 1 �� 10 ������������).""");
        Scanner console = new Scanner(System.in);
        ParsingData.parsingString(console.nextLine());

        if (ParsingData.flag) {
            int result;
            switch (ParsingData.arephmeticOperator) {
                case "+" -> {
                    result = ParsingData.valueFirsUser + ParsingData.valueSecondUser;
                    System.out.println("��������� = " + result);
                }
                case "-" -> {
                    result = ParsingData.valueFirsUser - ParsingData.valueSecondUser;
                    System.out.println("��������� = " + result);
                }
                case "*" -> {
                    result = ParsingData.valueFirsUser * ParsingData.valueSecondUser;
                    System.out.println("��������� = " + result);
                }
                case "/" -> {
                    result = ParsingData.valueFirsUser / ParsingData.valueSecondUser;
                    System.out.println("��������� = " + result);
                }
                default -> System.out.println("�������������� �������� �� ������");
            }
        }

    }
}
//}