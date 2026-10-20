public class Cactus extends Plant implements Consumable{
    private static final double CACTUS_PLANT_NUTRITION_BASE = 0.02;

    Cactus(String name, NutritionType nutritionType, double height) {
        super(name, nutritionType, height);
    }

    //Example of run-time Polymorfism
    @Override
    public double calculateConsumptionRate() {
        return CACTUS_PLANT_NUTRITION_BASE;
    }



}
