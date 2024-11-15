


class ValidateValueInt {
    static int ValueInt(int i) {
        if (i <= 10 & i > 0) {
            return i;
        } else {
            System.out.println("¬ведЄные числа не вход€т в диапозон от 1 до 10 включительно");
            throw new RuntimeException();
        }
    }
}
