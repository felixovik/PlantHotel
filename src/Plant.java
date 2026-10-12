public abstract class Plant {


    private String name;
    private String nutritionType;
    private double height;
    private double consumptionRatePerDay;

    Plant(String name, String type, String nutritionType, double height, double consumptionRatePerDay){
        this.name = name;
        this.nutritionType = nutritionType;
        this.height = height;
        this.consumptionRatePerDay = consumptionRatePerDay;
    }

    public String getNutritionType() {
        return nutritionType;
    }

    public double getHeight() {
        return height;
    }

    public double getConsumptionRate() {
        return consumptionRatePerDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNutritionType(String nutritionType) {
        this.nutritionType = nutritionType;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setConsumptionRate(double consumptionRatePerDay) {
        this.consumptionRatePerDay = consumptionRatePerDay;
    }

    public abstract double CalculateConsumptionRate();
}
