public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost=6809;//6809
        int bonusMiles= (int) service.calculate(cost);
        System.out.println(bonusMiles);
    }
}