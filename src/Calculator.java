public class Calculator {
public static final char ADDTION= '+';
public  static final char SUBTRUCTION = '-';
public  static final char MULTIPLICATION = '*';
public  static final char DIVISION = '/';
    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDTION:
                return firstOperand + secondOperand;
            case SUBTRUCTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                     return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}