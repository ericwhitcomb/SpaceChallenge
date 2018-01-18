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

        ArrayList<Rocket> rockets = new ArrayList<Rocket>();
        Rocket rocket = null;
        int i = 0;
        while(i < items.size()) {
            rocket = new U1();

            while(i < items.size() && rocket.canCarry(items.get(i))) {
                rocket.carry(items.get(i));
                i++;
            }

            rockets.add(rocket);
        }
        return rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {

        ArrayList<Rocket> rockets = new ArrayList<Rocket>();
        Rocket rocket = null;
        int i = 0;
        while(i < items.size()) {
            rocket = new U2();

            while(i < items.size() && rocket.canCarry(items.get(i))) {
                rocket.carry(items.get(i));
                i++;
            }

            rockets.add(rocket);
        }
        return rockets;
    }

    public double runSimulation(ArrayList<Rocket> rockets) {
        return 0;
    }
}
