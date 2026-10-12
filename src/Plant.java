public class Plant {
    private String name;
    private String type;
    private String nutritionType;
    private double height;
    private double consumptionRate;

    Plant(String name, String type, String nutritionType, double height, double consumptionRate){
        this.name = name;
        this.type = type;
        this.nutritionType = nutritionType;
        this.height = height;
        this.consumptionRate = consumptionRate;
    }

    public String getType() {
        return type;
    }

    public String getNutritionType() {
        return nutritionType;
    }

    public double getHeight() {
        return height;
    }

    public double getConsumptionRate() {
        return consumptionRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNutritionType(String nutritionType) {
        this.nutritionType = nutritionType;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setConsumptionRate(double consumptionRate) {
        this.consumptionRate = consumptionRate;
    }
}