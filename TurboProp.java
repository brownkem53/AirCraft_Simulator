package finalpartd;

/**
 * Change #4 The Singleton Design Pattern. We only want one instance of this 
 * TurboProp to exist in our application at a time.
 * 
 * 
 * A simple class to simulate a Turbo Prop airplane
 * Inspired by work of Dr. Ali Hassan
 * @author Paul Bonenfant, April 2021
 * @Author Kemon Brown
 */
public class TurboProp {

    private String model;
    private int cruiseAltitude;
    private int maxRange;

    /**
     * Three arg constructor to create a TurboProp
     * 
     * @param model The model of the aircraft
     * @param cruiseAltitude The cruising altitude of the aircraft
     * @param maxRange The maximum range of the aircraft
     */
    public TurboProp(String model, int cruiseAltitude, int maxRange) {
        this.model = model;
        this.cruiseAltitude = cruiseAltitude;
        this.maxRange = maxRange;
    }
    
      private static TurboProp instance = null; // this is our one global Object
    
    private TurboProp() {
        // empty private constructor for the Singleton
    }
    
    public static TurboProp getInstance() {
        if (instance == null) {
            instance = new TurboProp();
        }
        return instance;
    }
    

    /**
     * Adjust the flaps of the plane. Used when landing and taking off to increase lift.
     * @param angle 
     */
    public void adjustFlaps(int angle) {
        if (angle < 0 || angle > 50) {
            System.out.printf("%s %d%n", "Invalid flap angle", angle);
        } else {
            System.out.println("Flaps adjusted");
        }
    }


    /**
     * This method is to make the aircraft fly!
     * @param distance how far to go
     */
    public void fly(int distance) {
        if (distance > maxRange) {
            System.out.println("Not enough range to fly that far");
        } else { // let's go!
            System.out.println("Get ready to fly!"); 
        }
    }


    /**
     * This method displays the aircraft's information.
     */
    public void displayDetails() {
        System.out.println("Aircraft model: " + model);
        System.out.println("Aircraft cruise altitude: " + cruiseAltitude);
        System.out.println("Aircraft range: " + maxRange);
    }
}
