


class ValidateValueInt {
    static int ValueInt(int i) {
        if (i <= 10 & i > 0) {
            return i;
        } else {
            System.out.println("������� ����� �� ������ � �������� �� 1 �� 10 ������������");
            throw new RuntimeException();
        }
    }
}
