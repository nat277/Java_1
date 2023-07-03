/* Реализовать простой калькулятор */

public class test_3 {

    double a, b;
    String operation;

    public test_3() {
        System.out.println("Введите число a");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        System.out.println("какая будет операция?: +, -, /, *");
        oper = input.next();
        System.out.println("Введите второе число b");
        b = input.nextDouble();
        input.close();
    }

    public void resultat() {
        double res;
        switch (oper) {
            case "+":
                res = a + b;
                System.out.print(res);
                break;
            case "-":
                res = a - b;
                System.out.print(res);
                break;
            case "*":
                res = a * b;
                System.out.print(res);
                break;
            case "/":
                res = a / b;
                System.out.print(res);
                break   
              
               
        }
    }
}