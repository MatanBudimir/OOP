package sedmi;

public class Food {
    private FoodType type;
    private int weight;

    Food(FoodType type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public FoodType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s, w - %dg", type.toString(), weight);
    }

    public double getProtein() {
        return (type.getProtein() / 100.0) * weight;
    }

    public double getCarbs() {
        return type.getCarbs() / 100.0 * weight;
    }

    public double getFat() {
        return type.getFat() / 100.0 * weight;
    }

    public String toStringInGrams() {
        return String.format("%s: p - %.1fg, c - %.1fg, f - %.1fg, w - %dg", type.getName(), getProtein(), getCarbs(), getFat(), weight);
    }
}
