public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected SwimBehavior swimBehavior;

    public Duck() {}

    // methods to set behaviors dynamically
    public void setFlyBehavior(FlyBehavior fb) { flyBehavior = fb; }
    public void setQuackBehavior(QuackBehavior qb) { quackBehavior = qb; }
    public void setSwimBehavior(SwimBehavior sb) { swimBehavior = sb; }

    public void display() {} // to be implemented by subclasses

    // delegate behavior to the corresponding strategy objects
    public void performFly() { flyBehavior.fly(); }
    public void performQuack() { quackBehavior.quack(); }
    public void performSwim() { swimBehavior.swim(); }
}
