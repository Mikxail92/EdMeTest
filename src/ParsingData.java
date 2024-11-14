


class ParsingData {
    static String[] arrayString = new String[2];
    static int valueFirsUser;
    static int valueSecondUser;
    static String arephmeticOperator;


    public static void parsingString(String string) {
        try {
            arrayString = string.split(" ");
            valueFirsUser = ValidateValueInt.ValueInt(Integer.parseInt(arrayString[0]));
            valueSecondUser = ValidateValueInt.ValueInt(Integer.parseInt(arrayString[2]));
            arephmeticOperator = arrayString[1];
        } catch (NumberFormatException e) {

            System.out.println("Ошибка: Введены не корректные числа. \n" + e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индекса массива");
        } catch (RuntimeException e) {

        }
    }

}
