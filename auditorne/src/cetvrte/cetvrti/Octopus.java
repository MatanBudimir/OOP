package cetvrte.cetvrti;

public class Octopus extends SeaAnimal {
    public Octopus(SeaSpecies species) {
        super(species);
    }
    @Override
    public void wayOfMovement() {
        System.out.println("Octopus uses jet propulsion to swim");
    }
}
