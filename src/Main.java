import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите минимальное и максимальное количество карт");
        Scanner vvod = new Scanner(System.in);
        int p = vvod.nextInt(), k = vvod.nextInt(),a,n = k - p + 1, x = 0;
        for (int i = 1; i <= n; ) {
            a=p;
            if (a % 2 == 0)
                if (a == 2){
                            p++;i++;
                           }
                else {
                         a = a / 2;x++;
                     }
            else {
                    a = a * 3 + 1;x++;
                 }
            }
            System.out.println("Пасьянс cошелся, ходов потребовалось " + x);
        }
    }
