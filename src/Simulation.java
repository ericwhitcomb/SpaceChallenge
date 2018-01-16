import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        ArrayList<Item> items = new ArrayList<Item>();
        String[] elements = null;
        while (scanner.hasNextLine()) {
            elements = scanner.nextLine().trim().split("=");
            if (elements.length == 2) {
                items.add(new Item(elements[0].trim(), Integer.parseInt(elements[1].trim())));
            }

        }

        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        return null;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        return null;
    }

    public double runSimulation(ArrayList<Rocket> rockets) {

        return 0;
    }
}
