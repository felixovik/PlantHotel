public class CarnivorousPlant extends Plant{

    CarnivorousPlant(String name, String type, String nutritionType, double height) {
        super(name, type, nutritionType, height);
    }

    @Override
    public double CalculateConsumptionRate() {
        double CARNIVOROUS_PLANT_NUTRITION_MULTIPLIER = 0.2;
        double CARNIVOROUS_PLANT_NUTRITION_BASE = 0.1;
        return CARNIVOROUS_PLANT_NUTRITION_BASE + (CARNIVOROUS_PLANT_NUTRITION_MULTIPLIER*getHeight());
    }


}
