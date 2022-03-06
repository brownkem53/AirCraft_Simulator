package finalpartd;

/**
 * A simple class to simulate a Helicopter
 * Inspired by work of Dr. Ali Hassan
 * 
 * Change #1 According to the Open Closed Principle, TurboProp is closed for
 * modification but open for extension. Here we extended Helicopter to TurboProp
 * since helicopter has a turboprop engine
 * 
 * Change#2 According to the Single Responsibility Principle, Helicopter should
 * not be adjusting the blades themselves since there is class that already does 
 * that. 
 * 
 * Change #3 According to DRY, we are calculating if the flight can take place 
 * in TurboProp superclass, instead we invoke the superclass's 
 * implementation and check if the flight can take place and if so will be done. 
 * have to change it in one place.
 *
 * @Author Kemon Brown
 * @author Paul Bonenfant, April 2021
 *
 */
public class Helicopter extends TurboProp{

    /**
     * Three arg constructor to create a Helicopter
     * 
     * @param model The model of the aircraft
     * @param cruiseAltitude The cruising altitude of the aircraft
     * @param maxRange The maximum range of the aircraft
     */
    public Helicopter(String model, int cruiseAltitude, int maxRange) {
        super(model, cruiseAltitude, maxRange);
    }
    


    /**
     * Adjust the attack angle of the rotor blades
     * @param angle the angle to set the blades at
     */
    public void adjustBlades(int angle) {
        if (angle < 0 || angle > 20) {
            System.out.printf("%s %d%n", "Invalid blade angle", angle);
        } else {
            System.out.println("Blades adjusted");
        }
    }

}
