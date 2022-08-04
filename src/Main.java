import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите стоимость билета\n что бы увидеть количество бонусных миль:");
        int ticketPrice = s.nextInt();
        boolean bonus = ticketPrice > 20;
        if (bonus) {
            int x = ticketPrice / 20;
            System.out.println("Вам начислено" + " " + x + " " + "бонусных миль.");
        } else {
            System.out.println("Возьмите с собой друзей для начисления бонуснух миль.");
        }
        System.out.println("Приятного путишествия!");
    }
}
