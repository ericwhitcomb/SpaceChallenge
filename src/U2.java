public class U2 extends Rocket {

    U2() {
       super();
    }

    U2(double cost, int weight, int maxWeight, double explosionChance, double crashChance) {
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
