public class Main {
    public static void main(String[] args) {
        // Текущий счёт
        int currentAccount = 300;
        // Сумма пополнения
        int refill = 1200;
        // Стоимость бонусного рубля
        int bonusRuble = 100;
        // Условие начисления бонусных рублей
        int bonus;
        if (refill > 1000) {
            bonus = refill / bonusRuble;
        } else {
            bonus = 0;
        }
        // Сумма пополнения с бонусами
        int replenishmentAmount = refill + bonus;
        // Итоговый счёт
        int finalAccount = currentAccount + replenishmentAmount;
        System.out.println("Количество бонусов " + bonus + " рублей");
        System.out.println("Итоговый счёт " + finalAccount + " рублей");
    }
}