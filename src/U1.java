public class U1 extends Rocket {

    U1() {
       super();
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
