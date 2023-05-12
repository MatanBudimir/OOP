package cetvrte.cetvrti;

public class Fish extends SeaAnimal {

    public Fish(SeaSpecies species) {
        super(species);
    }

    @Override
    public void wayOfMovement() {
        System.out.println("The fish uses fins to swim");
    }
}
