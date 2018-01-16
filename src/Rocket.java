import java.util.ArrayList;

public class Rocket implements SpaceShip {

    private double cost;
    private int weight;
    private int cargoWeight;
    private int maxWeight;
    private double explosionChance;
    private double crashChance;

    private ArrayList<Item> cargo;

    Rocket() {
        cargo = new ArrayList<Item>();
    }

    Rocket(double cost, int weight, int maxWeight, double explosionChance, double crashChance) {
        this.setCost(cost);
        this.setWeight(weight);
        this.setMaxWeight(maxWeight);
        this.setExplosionChance(explosionChance);
        this.setCrashChance(crashChance);
    }

    // Getters and Setters
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCargoWeight() {
        return this.cargoWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getExplosionChance() {
        return explosionChance;
    }

    public void setExplosionChance(double explosionChance) {
        this.explosionChance = explosionChance;
    }

    public double getCrashChance() {
        return crashChance;
    }

    public void setCrashChance(double crashChance) {
        this.crashChance = crashChance;
    }

    // SpaceShip Interface implementation
    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        int w = this.weight + this.cargoWeight + item.getWeight();
        if (w > this.maxWeight) {
            return false;
        }
        return true;
    }

    @Override
    public void carry(Item item) {
        cargo.add(item);
        cargoWeight += item.getWeight();
    }
}
