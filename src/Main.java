// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int account = 100;
        int payment = 1100;
        int bonus;
        int total;
        if (payment > 1000) {
            bonus = payment / 100;
            total = account + payment + bonus;
            System.out.println("Итоговый счет = " + total + " руб.");
            System.out.println("Бонусные рубли = " + bonus);
        } else {
            bonus = 0;
            total = account + payment;
            System.out.println("Итоговый счет = " + total + " руб.");
            System.out.println("Бонусные рубли = " + bonus);
        }

    }
}