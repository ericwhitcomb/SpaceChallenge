import java.util.Random;

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
        double chance = this.getExplosionChance() * ((double) this.getCargoWeight() / (double) this.getMaxCargoWeight());
        return !(chance >= Util.random.nextDouble());
    }

    @Override
    public boolean land() {
        double chance = this.getCrashChance() * ((double) this.getCargoWeight() / (double) this.getMaxCargoWeight());
        return !(chance >= Util.random.nextDouble());
    }
}
