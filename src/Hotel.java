import javax.swing.*;

public class Hotel {


    static void main(String[] args) {
        Cactus Cacti = new Cactus("Igge", "Cactus", "MineralWater", 0.2);
        PalmTree PalmTree = new PalmTree("Laura", "PalmTree", "TapWater", 5.0);
        CarnivorousPlant CarnivorousPlant = new CarnivorousPlant("Meatloaf", "CarnivorousPlant", "ProteinDrink", 0.7);
        System.out.println("------Welcome To The Epic Plant Hotel------");



        System.out.println("Here are the plants: \n" + Cacti.getName() + " Consumes " + Cacti.CalculateConsumptionRate() + " Liters of " + Cacti.getNutritionType() + " Per Day." + "\n\n"
                +  PalmTree.getName() + " Consumes " + PalmTree.CalculateConsumptionRate() + " Liters of " + PalmTree.getNutritionType() + " Per Day." + "\n\n"
                + CarnivorousPlant.getName() + " Consumes " + CarnivorousPlant.CalculateConsumptionRate() + " Liters of " + CarnivorousPlant.getNutritionType() + " Per Day.");












    }
}
