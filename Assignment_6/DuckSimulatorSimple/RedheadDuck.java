public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }
    public void display() { System.out.println("I look like a redhead"); }
}
