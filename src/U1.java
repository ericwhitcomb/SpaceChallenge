public class U1 extends Rocket {

    U1() {
       super(
               Config.U1.COST,
               Config.U1.WEIGHT,
               Config.U1.MAX_WEIGHT,
               Config.U1.EXPLOSION_CHANCE,
               Config.U1.CRASH_CHANCE
       );
    }

    U1(double cost, int weight, int maxWeight, double explosionChance, double crashChance) {
        super(cost, weight, maxWeight, explosionChance, crashChance);
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }
}
