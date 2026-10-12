public class Cactus extends Plant{


    Cactus(String name, String type, String nutritionType, double height, double consumptionRate) {
        super(name, type, nutritionType, height, consumptionRate);
    }

    @Override
    public double CalculateConsumptionRate(){
        return getConsumptionRate();
    }

}
