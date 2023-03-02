package cetvrte.cetvrti;

public abstract class SeaAnimal extends Animal {
    private SeaSpecies species;

    public SeaAnimal(SeaSpecies species) {
        this.species = species;
    }
    abstract public void wayOfMovement();

    public void printSpecies() {
        System.out.println("Species -> " + species);
    }

    @Override
    public void introduceYourself() {
        System.out.println("I am a sea animal");
    }
}
