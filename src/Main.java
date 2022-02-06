public class Main {
    public static void main(String[] args) {
//        int ticketPriceInKopecks = -1_000_00;
        int ticketPriceInKopecks = 2_000_00;
        int costOf1MileInKopecks = 20_00;
        int numberOfMiles;

        if (ticketPriceInKopecks >= 0) {
            numberOfMiles = ticketPriceInKopecks / costOf1MileInKopecks;
        } else {
            numberOfMiles = 0;
        }

        System.out.println("Количество начисленных миль за купленный билет: " + numberOfMiles);
    }
}