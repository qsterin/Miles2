import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ticket = new Scanner(System.in);
        int ticketPrice;
        System.out.print("Введите стоимость билета: ");
        ticketPrice = ticket.nextInt();
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(ticketPrice);
        System.out.println("Вы заработали " + miles + " миль");
    }
}