public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int balance = 100;
        int replenishment = 1100;
        int bonus = 100;
        int bonus_chek = replenishment / bonus;


        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int sum;
        if (replenishment >= 1000) {
            sum = balance + replenishment + bonus_chek;
        } else {
            sum = balance + replenishment;
        }
        System.out.println(sum);
    }
}