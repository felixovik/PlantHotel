public abstract class Plant implements Consumable {
    // Private variables encapsulated by methods
    private String name;
    private NutritionType nutritionType;
    private double height;

    Plant(String name, NutritionType nutritionType, double height) {
        this.name = name;
        this.nutritionType = nutritionType;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public NutritionType getNutritionType() {
        return nutritionType;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNutritionType(NutritionType nutritionType) {
        this.nutritionType = nutritionType;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
