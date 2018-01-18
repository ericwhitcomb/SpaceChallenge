import java.util.ArrayList;
import java.util.Random;

public class Rocket implements SpaceShip {

    private double cost;
    private long weight;
    private long cargoWeight;
    private long maxWeight;
    private double explosionChance;
    private double crashChance;

    private ArrayList<Item> cargo;

    Rocket() {
        cargo = new ArrayList<Item>();
    }

    Rocket(double cost, long weight, long maxWeight, double explosionChance, double crashChance) {
        this.setCost(cost);
        this.setWeight(weight);
        this.setMaxWeight(maxWeight);
        this.setExplosionChance(explosionChance);
        this.setCrashChance(crashChance);

        cargo = new ArrayList<Item>();
    }

    // Getters and Setters
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public long getWeight() {
        return this.weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getCargoWeight() {
        return this.cargoWeight;
    }

    public long getMaxWeight() {
        return maxWeight;
    }

    public long getMaxCargoWeight() {
        return this.maxWeight - this.weight;
    }

    public void setMaxWeight(long maxWeight) {
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
        long w = this.weight + this.cargoWeight + item.getWeight();
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
