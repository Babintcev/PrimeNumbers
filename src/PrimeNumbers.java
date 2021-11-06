// Программа нахождения простых чисел от 2 до 100
public class PrimeNumbers {

    public static void main(String[] args) {
        int i, PrimeNum = 2;

        System.out.print("2, 3, 5, 7, "); // Вывод простых чисел от 0 до 10

        for (i = 2; i <= 100; i++){
            if (i % 2 != 0) {
                if (i % 3 != 0) {
                    if (i % 5 != 0) {
                        if (i % 7 != 0) {
                            if (i < 90) {
                                System.out.print(i + ", ");
                            }
                            else System.out.print(i + ".");
                        }
                    }
                }
            }
        }
    }
}
