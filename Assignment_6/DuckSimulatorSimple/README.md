
---

## File: `Duck.java`

### `Duck.java`
This abstract class serves as the base for all duck types, using the Strategy Pattern to delegate behaviors.

- **Class**: `Duck` (Abstract)
  - **Fields**:
    - `protected FlyBehavior flyBehavior`: Reference to the duck's flying behavior.
    - `protected QuackBehavior quackBehavior`: Reference to the duck's quacking behavior.
    - `protected SwimBehavior swimBehavior`: Reference to the duck's swimming behavior.
  - **Constructor**: `Duck()`
    - **Purpose**: Empty constructor; behaviors are set by subclasses.
  - **Methods**:
    - `setFlyBehavior(FlyBehavior fb)`: Dynamically sets the flying behavior.
    - `setQuackBehavior(QuackBehavior qb)`: Dynamically sets the quacking behavior.
    - `setSwimBehavior(SwimBehavior sb)`: Dynamically sets the swimming behavior.
    - `performFly()`: Delegates flying to the `flyBehavior` object.
    - `performQuack()`: Delegates quacking to the `quackBehavior` object.
    - `performSwim()`: Delegates swimming to the `swimBehavior` object.
    - `display()`: Abstract method to be implemented by subclasses to describe the duck's appearance.

---

## Behavior Interfaces

### `FlyBehavior.java`
- **Interface**: `FlyBehavior`
  - **Method**: `void fly()`
    - **Purpose**: Defines the contract for flying behavior.

### `QuackBehavior.java`
- **Interface**: `QuackBehavior`
  - **Method**: `void quack()`
    - **Purpose**: Defines the contract for quacking behavior.

### `SwimBehavior.java`
- **Interface**: `SwimBehavior`
  - **Method**: `void swim()`
    - **Purpose**: Defines the contract for swimming behavior.

---

## Behavior Implementations

### `FlyWithWings.java`
- **Class**: `FlyWithWings` (implements `FlyBehavior`)
  - **Method**: `fly()`
    - **Purpose**: Prints "Flying with wings!" for ducks that fly naturally.

### `FlyNoWay.java`
- **Class**: `FlyNoWay` (implements `FlyBehavior`)
  - **Method**: `fly()`
    - **Purpose**: Prints "I can't fly!" for ducks that cannot fly.

### `Quack.java`
- **Class**: `Quack` (implements `QuackBehavior`)
  - **Method**: `quack()`
    - **Purpose**: Prints "Quack quack!" for normal duck quacking.

### `Squeak.java`
- **Class**: `Squeak` (implements `QuackBehavior`)
  - **Method**: `quack()`
    - **Purpose**: Prints "Squeak squeak!" for rubber ducks.

### `MuteQuack.java`
- **Class**: `MuteQuack` (implements `QuackBehavior`)
  - **Method**: `quack()`
    - **Purpose**: Prints "I can't quack!" for silent ducks.

### `Swim.java`
- **Class**: `Swim` (implements `SwimBehavior`)
  - **Method**: `swim()`
    - **Purpose**: Prints "Swimming gracefully!" for ducks that swim normally.

### `Float.java`
- **Class**: `Float` (implements `SwimBehavior`)
  - **Method**: `swim()`
    - **Purpose**: Prints "Floating on water!" for rubber ducks.

### `Drown.java`
- **Class**: `Drown` (implements `SwimBehavior`)
  - **Method**: `swim()`
    - **Purpose**: Prints "I can't swim - I'm drowning!" for decoy ducks.

---

## Duck Subclasses

### `MallardDuck.java`
- **Class**: `MallardDuck` (extends `Duck`)
  - **Constructor**: `MallardDuck()`
    - **Purpose**: Sets behaviors to `FlyWithWings`, `Quack`, and `Swim`.
  - **Method**: `display()`
    - **Purpose**: Prints "I look like a mallard".

### `RedheadDuck.java`
- **Class**: `RedheadDuck` (extends `Duck`)
  - **Constructor**: `RedheadDuck()`
    - **Purpose**: Sets behaviors to `FlyWithWings`, `Quack`, and `Swim`.
  - **Method**: `display()`
    - **Purpose**: Prints "I look like a redhead".

### `RubberDuck.java`
- **Class**: `RubberDuck` (extends `Duck`)
  - **Constructor**: `RubberDuck()`
    - **Purpose**: Sets behaviors to `FlyNoWay`, `Squeak`, and `Float`.
  - **Method**: `display()`
    - **Purpose**: Prints "I look like a rubber duck".

### `DecoyDuck.java`
- **Class**: `DecoyDuck` (extends `Duck`)
  - **Constructor**: `DecoyDuck()`
    - **Purpose**: Sets behaviors to `FlyNoWay`, `MuteQuack`, and `Drown`.
  - **Method**: `display()`
    - **Purpose**: Prints "I look like a decoy duck".

---

## File: `DuckSimulator.java`

### `DuckSimulator.java`
This class serves as the main entry point to test the duck simulator.

- **Class**: `DuckSimulator`
  - **Method**: `main(String[] args)`
    - **Purpose**: Creates and tests different duck instances.
    - **Implementation**: 
      - Prints a header with the date (March 5, 2025).
      - Creates instances of `MallardDuck`, `RedheadDuck`, `RubberDuck`, and `DecoyDuck`.
      - Calls `testDuck()` for each instance to demonstrate their behaviors.
    - **Additional Notes**: Includes student information (name, ID, batch) as comments.
  - **Method**: `testDuck(Duck duck)` (Private Helper)
    - **Purpose**: Tests a duck by calling its `display()`, `performFly()`, `performQuack()`, and `performSwim()` methods.
    - **Parameters**: `Duck duck` - The duck to test.
    - **Implementation**: Executes all behaviors and prints a separator line.

---

