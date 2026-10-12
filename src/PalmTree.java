public class PalmTree extends Plant{


    PalmTree(String name, String type, String nutritionType, double height, double consumptionRate) {
        super(name, type, nutritionType, height, consumptionRate);
    }

    @Override
    public double CalculateConsumptionRate() {
        double PALM_TREE_NUTRITION_MULTIPLIER = 0.5;
        return PALM_TREE_NUTRITION_MULTIPLIER * getHeight();
    }

}
