package finalpartd;

/**
 * A simple class to simulate Aircraft. 
 *
 * Inspired by work of Dr. Ali Hassan
 * @Author Kemon Brown
 * @Author Paul Bonenfant, Aug 2021
 */
public class AircraftSimulator {

    public static void main(String[] args) {
        AircraftSimulator aircraft = new AircraftSimulator();
        aircraft.run();
    }

    private void run() {
        
        //implementing the Singleton
        TurboProp turbo = TurboProp.getInstance();
        
        // Create a Turbo Prop
        TurboProp aircraft1 = new TurboProp("Dash 8-400", 7620, 2520);
        aircraft1.adjustFlaps(25);
        aircraft1.fly(1000);
        aircraft1.displayDetails();
        
        System.out.println("----");
        
        // Create a Helicopter
        Helicopter aircraft2 = new Helicopter("Bell 206", 1500, 700);
        aircraft2.adjustBlades(10);
        aircraft2.fly(100);
        aircraft2.displayDetails();
        

    }
}
