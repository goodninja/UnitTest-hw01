package task01.Calculator;

public class Calculator {
    public static void main(String[] args) {

        int result = calculation(10, 5, '/');
        System.out.println(result);

    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // Метод вычисления суммы покупки со скидкой

    public static double calculateDiscount(double purchasingAmount, int discountingAmount) {

        double discountedAmount = 0;

        if (purchasingAmount >= 0) {

            if (discountingAmount >= 0 && discountingAmount <= 100) {
                discountedAmount = purchasingAmount - (purchasingAmount * discountingAmount) / 100;
            } else {
                throw new ArithmeticException("Скидка должна быть в диапазоне от 0 до 100");
            }

        } else {
            throw new ArithmeticException("Сумма не может быть отрицательной");
        }

        return discountedAmount;
    }
}
