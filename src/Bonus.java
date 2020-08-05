public class Bonus {
    public static void main(String[] args) {
        int ticketPriceInRoubles = 119;
        int bonusRate = 20;
        int bonusMiles = ticketPriceInRoubles / bonusRate;
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}
