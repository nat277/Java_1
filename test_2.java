/* Вывести все простые числа от 1 до 1000 */

public class Test_2 {
    int a;
    int b;

    public Test_2() {
        System.out.println("Первое число a");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("Последнее число b");
        b = input.nextInt();
        input.close();
    }

    public void Num() {
        int count;
        System.out.println("Простые числа от a до b");
        for(int i = n1; i <= n2; i++) {
            count = 0;
            for(int j = 2; j <= i; j++) {
                if((i % j) == 0) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(i + " ");
            }
            count = 0;
        }
    }
}