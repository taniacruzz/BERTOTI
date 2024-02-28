public class Rex extends Dinosaur {
    Double bite;
    
    public Rex(Double weight, Double bite) {
        super(weight);
        this.bite = bite;
    }
    
    public void eat() {
        System.out.print("Attacking my friends and ");
        super.eat();
    }
}
