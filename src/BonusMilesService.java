public class BonusMilesService {
    public long calculate(int cost) {
       // double ticketPrice = 6809;
        int moneyForMile = 20;
        int bonusMiles = (int) Math.floor(cost / moneyForMile);
        return bonusMiles;
    }
}
