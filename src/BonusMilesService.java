public class BonusMilesService {
    public int calculate(int cost) {
            int coins = 20;
            int miles = 1;
            int bonus = cost / coins * miles;
        return bonus;
    }
}
