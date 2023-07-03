/* Вычислить n-ое треугольного число (сумма чисел от 1 до n),
n! (произведение чисел от 1 до n)*/


public class test_1 {
    int n;
    public test_1() {
        System.out.println("Введите целое число n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.close();
    }

    public void summa() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Cумма чисел от 1 до n: " + sum);
    }

    public void Factorial() {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("n!: " + factorial);
    }
}