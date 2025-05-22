// Language: Java

class Calculator {
    private double a, b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public String calculate() {
        switch (operation) {
            case "add":
                return String.valueOf(a + b);
            case "subtract":
                return String.valueOf(a - b);
            case "multiply":
                return String.valueOf(a * b);
            case "divide":
                if (b != 0)
                    return String.valueOf(a / b);
                else
                    return "Error: Division by zero";
            default:
                return "Invalid operation";
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 5, "divide");
        System.out.println("Result: " + calc.calculate());
    }
}
