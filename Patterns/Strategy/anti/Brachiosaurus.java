public class Brachiosaurus extends Dinosaur{
    Double neckSize;

    public Brachiosaurus(Double weight, Double neckSize){
        super(weight);
        this.neckSize = neckSize;
    }
    
    public void eat() {
        System.out.print("Picking a leaf and ");
        super.eat();
    }
}