import javax.swing.JOptionPane;
public class Main {

    static int[] inputNumbers(boolean dual) {

        int inputNumbers = 2;

        if (!dual) {
            inputNumbers = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers?"));
        }

        int[] numbers = new int[inputNumbers];

        for (int i = 0; i < inputNumbers; i++) {
            int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number"));
            numbers[i] = input;
        }
        return numbers;
    }

    static int sum() {
        int[] numbers = inputNumbers(false);
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    static int res() {
        int[] numbers = inputNumbers(false);
        int total = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++){
            total -= numbers[i];
        }
        return total;
    }

    static int multiply() {
        int[] numbers = inputNumbers(false);
        int total = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++){
            total *= numbers[i];
        }
        return total;
    }

    static int pow() {
        int[] numbers = inputNumbers(true);
        int total = 1;
        int a = numbers[0];
        int b = numbers[1];

        for (int i = 0; i < b; i++) {
            total *= a;
        }
        return total;
    }

    static int divide() {
        int[] numbers = inputNumbers(true);
        int total = 0;
        int a = numbers[0];
        int b = numbers[1];

        if(b == 0) {
            JOptionPane.showMessageDialog(null,"div by zero not possible");
        } else{
            total = a / b;
        }
        return total;

    }

    public static void main(String[] args) {

        String[] options = {"sum", "res", "multiply", "pow", "divide", "exit"};


        boolean exit = false;

        while (!exit) {

            int option = JOptionPane.showOptionDialog(null,"La calculadora", "Hola", 0, 1,null, options, options[0]);
            int res;
            switch (options[option]) {
                case "sum":
                    res = sum();
                    JOptionPane.showMessageDialog(null, "Result: " + res);
                    break;

                case "res" :
                    res = res();
                    JOptionPane.showMessageDialog(null, "Result: " + res);
                    break;

                case "multiply":
                    res = multiply();
                    JOptionPane.showMessageDialog(null, "Result: " + res);
                    break;

                case "pow":
                    res = pow();
                    JOptionPane.showMessageDialog(null, "Result: " + res);
                    break;

                case "divide":
                    res = divide();
                    JOptionPane.showMessageDialog(null, "Result: " + res);
                    break;

                case "exit":
                    exit = true;
                    break;

                default:
                    exit = true;
                    break;
            }

        }

    }
}