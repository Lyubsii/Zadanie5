public class BonusMilesService {
    public int calculate(int cost) {
        int oneMileBonus = 20;
        int bonusMile = cost / oneMileBonus;
        return bonusMile; // ввозвращаем рассчитанное кол-во бонусных миль
    }

}


