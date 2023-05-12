package cetvrte.treci;

public abstract class SeaAnimal extends Animal {
    abstract public void wayOfMovement();

    @Override
    public void introduceYourself() {
        System.out.println("I am a sea animal");
    }
}
