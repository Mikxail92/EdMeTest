


class ValidateValueInt {
    static int ValueInt(int i) throws RuntimeException {
        if (i <= 10 & i > 0) {
            return i;
        } else {
            System.out.println("������� ����� �� ������ � ������ �� 0 �� 10 ������������");
            throw new RuntimeException();
        }
    }
}
