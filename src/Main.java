import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ticket = new Scanner(System.in);
        int price;
        System.out.print("Введите стоимость билета: ");
        price = ticket.nextInt();
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(price);
        System.out.println("Вы заработали " + miles + " миль");
    }
}