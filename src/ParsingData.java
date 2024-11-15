import java.util.logging.SocketHandler;

class ParsingData {
    static boolean flag = false;
    static String[] arrayString = new String[3];

    static int valueFirsUser;
    static int valueSecondUser;
    static String arephmeticOperator;

    public static void parsingString(String string) {

        try {
            arrayString = string.split(" ", 3);

            int a = Integer.parseInt(arrayString[0]);
            int b = Integer.parseInt(arrayString[2]);
            arephmeticOperator = arrayString[1];
            valueSecondUser = ValidateValueInt.ValueInt(b);
            valueFirsUser = ValidateValueInt.ValueInt(a);
            flag = true;

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введены не корректные числа. \n" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индекса массива");
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

}
