public class BonusMilesService {
    int oneMile = 20;

    public int calculate(int ticketPrice) {
        int miles = ticketPrice / oneMile;
        return miles;
    }

}

