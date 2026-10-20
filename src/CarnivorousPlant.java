public class CarnivorousPlant extends Plant implements Consumable{

    private static final double CARNIVOROUS_PLANT_NUTRITION_MULTIPLIER = 0.2;
    private static final double CARNIVOROUS_PLANT_NUTRITION_BASE = 0.1;

    CarnivorousPlant(String name, NutritionType nutritionType, double height) {
        //Call the superclass
        super(name, nutritionType, height);
    }


    //Example of run-time Polymorfism
    @Override
    public double calculateConsumptionRate() {
        return CARNIVOROUS_PLANT_NUTRITION_BASE + (CARNIVOROUS_PLANT_NUTRITION_MULTIPLIER*getHeight());
    }


}
