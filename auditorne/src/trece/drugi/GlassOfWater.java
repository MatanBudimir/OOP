package trece.drugi;

public class GlassOfWater {
    private int amount, amountOfWater, noOfCubes;
    private static final int amountPerCube = 50;

    public GlassOfWater(int amount) {
        this.amount = amount;
    }

    public void addWater(int amountOfWater) {
        checkWater();
    }

    public void addIceCubes(int noOfCubes) {
        checkWater();
    }

    private void checkWater() {

    }
}
