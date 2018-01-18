import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static final String PHASE1_FILENAME = "phase-1.txt";
    public static final String PHASE2_FILENAME = "phase-2.txt";

    public static void main(String[] args) {

        Simulation sim = new Simulation();

        ArrayList<Item> items = null;
        ArrayList<Rocket> rockets = null;
        double projectedBudget = 0;

        try {
            items = sim.loadItems(PHASE1_FILENAME); // Phase-1
            System.out.println("Phase-1:");
            rockets = sim.loadU1(items);
            projectedBudget += sim.runSimulation(rockets);
            System.out.println("Number of U1 rockets = " + rockets.size());
            System.out.println("U1 projected budget =  " + projectedBudget);
            rockets = sim.loadU2(items);
            projectedBudget += sim.runSimulation(rockets);
            System.out.println("Number of U2 rockets = " + rockets.size());
            System.out.println("U2 projected budget =  " + projectedBudget);
            items = sim.loadItems(PHASE2_FILENAME); // Phase-2
            System.out.println("Phase-2:");
            rockets = sim.loadU1(items);
            projectedBudget += sim.runSimulation(rockets);
            System.out.println("Number of U1 rockets = " + rockets.size());
            System.out.println("U1 projected budget =  " + projectedBudget);
            rockets = sim.loadU2(items);
            projectedBudget += sim.runSimulation(rockets);
            System.out.println("Number of U2 rockets = " + rockets.size());
            System.out.println("U2 projected budget =  " + projectedBudget);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
