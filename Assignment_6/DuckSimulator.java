/*
 * Name  : Piyush Gawade
 * PRN   : 23070126090
 * Batch : B1
*/

public class DuckSimulator {
    public static void main(String[] args) {
        System.out.println("Duck Simulator - March 5, 2025\n");

        // create different duck instances
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        // test all ducks
        System.out.println("Mallard Duck:");
        testDuck(mallard);
        System.out.println("\nRedhead Duck:");
        testDuck(redhead);
        System.out.println("\nRubber Duck:");
        testDuck(rubber);
        System.out.println("\nDecoy Duck:");
        testDuck(decoy);
    }

    // helper method to test a duck's behaviors
    private static void testDuck(Duck duck) {
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.performSwim();
        System.out.println("-------------------");
    }
}
