public class RexPattern extends DinosaurPattern implements EatBehaviour {
    Double bite;

    public RexPattern(Double weight, Double bite) {
        super(weight);
        this.bite = bite;
    }

    public void EatBehaviour() {
        System.out.print("Attacking my friends and eating like a Dinosaur");
        
    }

    
}
