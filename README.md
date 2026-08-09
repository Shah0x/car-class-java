# car-class-java

A foundational reference implementation demonstrating Object-Oriented Programming (OOP) paradigms in core Java. This project provides a explicit model of class design, parameterized state initialization via constructors, encapsulation, and stack-to-heap memory allocation within the Java Virtual Machine (JVM).

---

## Architectural & Memory Model

The implementation consists of an entry point runner class and an encapsulated `Car` domain model. When executed, the JVM allocates local reference variables on the call stack that point to object instances instantiated on the heap memory region.

```
 CALL STACK JVM HEAP
+-----------------------+ +-----------------------+
| Main.main() Frame | | Car Object Instance |
| | |-----------------------|
| carRef1 -------------+-------------> | - make: "Toyota" |
| | | - model: "Camry" |
| carRef2 -------------+-----+ | - year: 2022 |
+-----------------------+ | +-----------------------+
 | 
 | +-----------------------+
 +-------> | Car Object Instance |
 |-----------------------|
 | - make: "Honda" |
 | - model: "Civic" |
 | - year: 2024 |
 +-----------------------+
```

### Domain Design

* **Encapsulation**: Private instance attributes prevent unmonitored external state mutation.
* **Constructor Initialization**: Enforces complete state construction upon instance allocation.
* **Display Semantics**: Formatted standard output (`stdout`) rendering of internal object attributes without exposing internal memory structure directly.

---

## Technical Specifications

| Component | Specification |
| :--- | :--- |
| **Language** | Java (JDK 11+ recommended) |
| **Paradigm** | Imperative / Object-Oriented |
| **Build System** | Native JDK CLI Toolchain (`javac` / `java`) |
| **Dependencies** | None (Java Standard Library only) |

---

## Technical Layout

```
car-class-java/
└─ src/
 Car.java # Encapsulated domain class definition
 Main.java # Application entry point & stack context execution
```

---

## Local Development & Execution

### Prerequisites

Ensure a valid Java Development Kit (JDK) is installed and available in your system path:

```bash
java -version
javac -version
```

### Compilation and Execution

1. **Clone the repository**:
 ```bash
 git clone https://github.com/Shah0x/car-class-java.git
 cd car-class-java
 ```

2. **Compile the source files**:
 Compile both the domain class and driver class into bytecode target directories:
 ```bash
 javac -d bin src/*.java
 ```

3. **Execute the application**:
 Run the compiled bytecode using the JVM runner:
 ```bash
 java -cp bin Main
 ```

---

## Design Considerations & Future Refactoring

* **Immutability Context**: Modern Java implementations (JDK 14+) can replace standard class state wrappers with Java `record` semantics if instance state is intended to be immutable post-construction.
* **Type Safety & Validation**: Input sanitization inside constructors can enforce invariant guarantees (e.g., non-negative manufacturing year).
* **Abstraction Layer**: Introducing a `Vehicle` interface or abstract base class would facilitate polymorphic behavior for alternative vehicle types.