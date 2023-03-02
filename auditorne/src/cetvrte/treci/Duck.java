package cetvrte.treci;

public class Duck extends Animal implements MakeSound {
    @Override
    public void introduceYourself() {
        System.out.println("I am a duck");
    }

    @Override
    public void makeSound() {
        System.out.println("I make sound using my beak");
    }
}
