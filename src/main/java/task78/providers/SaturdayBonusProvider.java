package task78.providers;

import task78.interfaces.SaturdayBonus;

public class SaturdayBonusProvider implements SaturdayBonus {
    @Override
    public double getSaturdayBonus() {
        return 50.0;
    }
}
