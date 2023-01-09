import java.util.Scanner;


    public class Calculator implements Calculatable {
        private SymbolCheck symbolCheck;
        private double result;
        private Scanner scanner;

        public Calculator(double result, Scanner scanner) {
            this.result = result;
            this.scanner = scanner;
        }

        public Scanner getScanner() {
            return scanner;
        }

        public void setScanner(Scanner scanner) {
            this.scanner = scanner;
        }

        public double getResult() {
            return result;
        }

        public void setResult(double result) {
            this.result = result;
        }

        @Override
        public String toString() {
            return "Calculator{" +
                    "result=" + result +
                    ", scanner=" + scanner +
                    '}';
        }

        public void summ(double plus) {
            result += plus;
            System.out.println("your  result -> " + result);
        }

        public void difference(double minus) {
            result = result - minus;
            System.out.println("your result -> " + result);
        }

        public void multiply(double mult) {
            result = result * mult;
            System.out.println("your result -> " + result);
        }

        public void division(double div) {
            if (div == 0)
                System.out.println("division by zero is impossible");
            else result = result / div;
            System.out.println("your result -> " + result);
        }


        public void percent() {
            double number = 0;
            System.out.println(" how you want to work with percent 0 to plus, 1 to minus ,2 to divide, 3 to multiply");
            String symbol = scanner.nextLine();
            int choice = symbolCheck.checkSymbol(symbol);
            switch (choice) {
                case 0:
                    System.out.println("input number");
                    number = scanner.nextDouble();
                    number = result * number / 100;
                    summ(number);
                    break;
                case 1:
                    System.out.println("input number");
                    number = scanner.nextDouble();
                    number = result * number / 100;
                    difference(number);
                    break;
                case 2:
                    System.out.println("input number");
                    number = scanner.nextDouble();
                    if (number == 0) {
                        System.out.println("impossible to divide by zero");
                    } else {
                        number = result * number / 100;
                        division(number);
                    }
                    break;
                case 3:
                    System.out.println("input number");
                    number = scanner.nextDouble();
                    number = result * number / 100;
                    multiply(number);
                    break;
                default:
                    System.out.println("symbol");
            }


        }

        public void nullResult() {
            result = 0;
        }

        public void process() {
            SymbolCheck symbolCheck = new SymbolCheck();
            double number = 0;
            int choice = 0;
            do {
                System.out.println("choose your action: \n0 to null your result\n1 to plus \n2 to minus  \n3 to divide \n4 to multiply\n5 to work with percent  \n6 to end work");
                String symbol = scanner.next();
                choice = symbolCheck.checkSymbol(symbol);
                switch (choice) {
                    case 0:
                        nullResult();
                        break;
                    case 1:
                        System.out.println("input number");
                        number = scanner.nextDouble();
                        summ(number);
                        break;
                    case 2:
                        System.out.println("input number");
                        number = scanner.nextDouble();
                        difference(number);
                        break;
                    case 3:
                        System.out.println("input number");
                        number = scanner.nextDouble();
                        if (number == 0) {
                            System.out.println("impossible to divide by zero");
                        } else
                            division(number);
                        break;
                    case 4:
                        System.out.println("input number");
                        number = scanner.nextDouble();
                        multiply(number);
                        break;
                    case 5:
                        percent();
                        break;
                    case 6:
                        System.out.println("thanks for using");
                        break;
                    default:
                        System.out.println("chosen wrong number");
                }
            } while (choice != 6);
        }

        @Override
        public void calculates() {
            System.out.println("can calculate");

        }
    }


