
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        System.out.println(" ������� � ������� ��������� ���������������� ����: �_+_Y.\n " +
                "����� X � Y �� 0 �� 10.\n " +
                "������ ����� _ ������.");

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
                    System.out.println("�������� �� ������");
            }
        } catch (RuntimeException e) {
        }


    }
}