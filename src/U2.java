import java.util.Random;

public class U2 extends Rocket {

    U2() {
        super(
                Config.U2.COST,
                Config.U2.WEIGHT,
                Config.U2.MAX_WEIGHT,
                Config.U2.EXPLOSION_CHANCE,
                Config.U2.CRASH_CHANCE
        );
    }

    U2(double cost, int weight, int maxWeight, double explosionChance, double crashChance) {
        super(cost, weight, maxWeight, explosionChance, crashChance);
    }

    @Override
    public boolean launch() {
        double chance = this.getExplosionChance() * ((double) this.getCargoWeight() / (double) this.getMaxCargoWeight());
        return !(chance >= Util.random.nextDouble());
    }

    @Override
    public boolean land() {
        double chance = this.getCrashChance() * ((double) this.getCargoWeight() / (double) this.getMaxCargoWeight());
        return !(chance >= Util.random.nextDouble());
    }
}
