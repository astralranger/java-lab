public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        swimBehavior = new Float();
    }
    public void display() { System.out.println("I look like a rubber duck"); }
}
