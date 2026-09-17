# Assignment 2: Creational Design Patterns

## Chosen Domain: Drone World Simulator

This repository demonstrates the practical implementation of two creational design patterns in Java:
* **Part A: Factory Method**
* **Part B: Abstract Factory**

---

## Part A: Factory Method (Single Product)

### Overview
In Part A, object creation is delegated to subclasses via inheritance, avoiding tight coupling with concrete drone classes.

* **Product Interface:** `Drone` with business method `performMission()`.
* **Concrete Products:**
  * `ScoutDrone` — scans perimeter and detects threats.
  * `AttackDrone` — executes missile strikes.
  * `RepairDrone` — restores shields and repairs allies.
* **Abstract Creator:** `DroneStation` declaring the factory method `abstract Drone createDrone()` and encapsulating the execution pipeline in `deployDrone()`.
* **Concrete Creators:** `ScoutStation`, `AttackStation`, `RepairStation`.

---

## Part B: Abstract Factory (Product Families)

### Overview
Part B implements an abstract factory to guarantee that related world objects (`Terrain` and `Enemy`) are always internally compatible and cannot be mixed accidentally.

* **Abstract Products:**
  * `Terrain` with `render()`
  * `Enemy` with `spawn()`
* **Abstract Factory Interface:** `WorldFactory` defining:
  * `Terrain createTerrain()`
  * `Enemy createEnemy()`
* **Concrete Factories & Families:**
  * `CyberCityFactory` produces `CyberTerrain` + `CyborgEnemy`.
  * `AlienWastelandFactory` produces `WastelandTerrain` + `AlienSwarm`.
* **Client:** `WorldClient` relies strictly on composition, accepting `WorldFactory` as a dependency and remaining completely decoupled from concrete classes.

---

## Key Differences: Factory Method vs. Abstract Factory

| Feature | Factory Method | Abstract Factory |
| :--- | :--- | :--- |
| **Scope** | Creates a single product | Creates a family of related products |
| **Mechanism** | Relies on **inheritance** (subclasses override creation) | Relies on **composition** (client receives factory object) |
| **Adding New Items** | Adding a new drone type requires a new Product and Creator subclass (Open/Closed Principle) | Adding a new product type (e.g. `Weather`) modifies the `WorldFactory` interface and all its implementations |

---

## How to Run

Compile and execute `Main.java` from the `src` directory:
```bash
javac src/factorymethod/*.java src/abstractfactory/*.java src/Main.java
java -cp src Main
