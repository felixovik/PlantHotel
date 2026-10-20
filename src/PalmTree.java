public class PalmTree extends Plant implements Consumable{

    //Declare Constant
    private static final double PALM_TREE_NUTRITION_MULTIPLIER = 0.5;

    PalmTree(String name, NutritionType nutritionType, double height) {
        //Call the superclass
        super(name, nutritionType, height);
    }

    //Example of run-time Polymorfism
    @Override
    public double calculateConsumptionRate() {
        return PALM_TREE_NUTRITION_MULTIPLIER * getHeight();
    }
}
