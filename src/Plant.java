public abstract class Plant {


    private String name;
    private String nutritionType;
    private double height;

    Plant(String name, String type, String nutritionType, double height){
        this.name = name;
        this.nutritionType = nutritionType;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public String getNutritionType() {
        return nutritionType;
    }

    public double getHeight() {
        return height;
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

    public abstract double CalculateConsumptionRate();
}
