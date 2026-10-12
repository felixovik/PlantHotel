public class Cactus extends Plant{
    private double CACTUS_PLANT_NUTRITION_BASE = 0.02;

    Cactus(String name, String type, String nutritionType, double height) {
        super(name, type, nutritionType, height);
    }

    @Override
    public double CalculateConsumptionRate(){
        return CACTUS_PLANT_NUTRITION_BASE;
    }

}
