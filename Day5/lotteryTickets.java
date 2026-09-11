package Day5;

public class lotteryTickets {
    private static final int LENGTH = 6;
    private static final int MAX_LOTTARY_NUMBER = 69;

    public static int[] generateTicketNumbers() {

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < ticket.length; i++) {

            int RandomNumber;

            do {
                RandomNumber = random.nextInt(MAX_LOTTARY_NUMBER) + 1;
            } while (search(ticket, RandomNumber));

            ticket[i] = RandomNumber;
        }

        return ticket;
    }

    public static boolean search(int[] array, int NumbertoSearchFor) {

        for (int value : array) {
            if (value == NumbertoSearchFor)
                return true;
        }

        return false;
    }

    public static void printTicketNumbers(int[] ticket) {

        for (int number : ticket) {
            System.out.print(number + " | ");
        }
    }

    public static void main(String[] args) {

        int[] ticket = generateTicketNumbers();
        printTicketNumbers(ticket);
    }
}
