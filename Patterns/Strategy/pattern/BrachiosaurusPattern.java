public class BrachiosaurusPattern extends DinosaurPattern implements EatBehaviour {
    Double neckSize;

    public BrachiosaurusPattern (Double weight, Double neckSize) {
        super(weight);
        this.neckSize = neckSize;
    }
    
    public void EatBehaviour() {
        System.out.print("Picking a leaf and eating like a Dinosaur");
    }
}
