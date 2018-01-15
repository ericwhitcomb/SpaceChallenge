public class Item {
    private String name;
    private int weight;

    Item() {
        name = "";
        weight = 0;
    }

    Item(String name, int weight) {
        this.setName(name);
        this.setWeight(weight);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
