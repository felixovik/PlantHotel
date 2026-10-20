import java.awt.*;
import javax.swing.*;

public class Hotel {
    static void main(String[] args) {
        Cactus igge = new Cactus("Igge", NutritionType.MINERAL_WATER, 0.2);
        PalmTree laura = new PalmTree("Laura", NutritionType.TAP_WATER, 5.0);
        PalmTree olof = new PalmTree("Olof", NutritionType.TAP_WATER, 1.0);
        CarnivorousPlant meatloaf = new CarnivorousPlant("Meatloaf", NutritionType.PROTEIN_DRINK, 0.7);

    /*
    System.out.println("------Welcome To The Epic Plant Hotel------");
    System.out.println("Here are the plants: \n" + Cacti.getName() + " Consumes " +
    Cacti.CalculateConsumptionRate() + " Liters of " + Cacti.getNutritionType() + " Per Day." +
    "\n\n"
            +  PalmTree.getName() + " Consumes " + PalmTree.CalculateConsumptionRate() + " Liters of
    " + PalmTree.getNutritionType() + " Per Day." + "\n\n"
            + CarnivorousPlant.getName() + " Consumes " +
    CarnivorousPlant.CalculateConsumptionRate() + " Liters of " +
    CarnivorousPlant.getNutritionType() + " Per Day.");
    */

        String plant =
                JOptionPane.showInputDialog("Choose a plant to feed: Igge, Laura, MeatLoaf or Olof");
        if (plant == null) {
            JOptionPane.showMessageDialog(null, "Please enter a valid option!");
        } else if (plant.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input cannot be empty!");
            // Utilities.openWebpage("https://www.youtube.com/watch?v=EE-xtCF3T94");
        } else if (plant.equalsIgnoreCase("igge")) {
            JOptionPane.showMessageDialog(null,
                    "Plant information: \n Name: " + igge.getName() + "\n Consumes "
                            + igge.calculateConsumptionRate() + " Liters of " + igge.getNutritionType()
                            + " Per Day.");
        } else if (plant.equalsIgnoreCase("larua")) {
            JOptionPane.showMessageDialog(null,
                    "PLant information: \n Name: " + laura.getName() + "\n Consumes "
                            + laura.calculateConsumptionRate() + " Liters of " + laura.getNutritionType()
                            + " Per Day.");
        } else if (plant.equalsIgnoreCase("meatloaf")) {
            JOptionPane.showMessageDialog(null,
                    "Plant information: \n Name: " + meatloaf.getName() + "\n Consumes "
                            + meatloaf.calculateConsumptionRate() + " Liters of " + meatloaf.getNutritionType()
                            + " Per Day.");
        } else if (plant.equalsIgnoreCase("olof")) {
            JOptionPane.showMessageDialog(null,
                    "Plant information: \n Name: " + olof.getName() + "\n Consumes "
                            + olof.calculateConsumptionRate() + " Liters of " + olof.getNutritionType()
                            + " Per Day.");
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid option!");
            Utilities.openWebpage("https://www.youtube.com/watch?v=EE-xtCF3T94");
        }
    }
}
