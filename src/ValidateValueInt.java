


class ValidateValueInt {
    static int ValueInt(int i) throws RuntimeException {
        if (i <= 10 & i > 0) {
            return i;
        } else {
            System.out.println("¬ведЄные числа не вход€т в формат от 0 до 10 включительно");
            throw new RuntimeException();
        }
    }
}
