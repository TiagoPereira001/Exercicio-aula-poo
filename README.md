# Java Inheritance & Polymorphism Demo

A concise lab exercise focusing on **multi-level inheritance** and **runtime polymorphism** in Java.

## 🧬 Class Hierarchy

The project implements a linear inheritance chain (`A` -> `B` -> `C`) to demonstrate state extension:

* **`src/A.java`**: Base class holding integer state (`int a`).
* **`src/B.java`**: Extends `A`, adding floating-point precision (`double b`).
* **`src/C.java`**: Extends `B`, adding a character property and a specific business logic method `sum()`.

## 💻 implementation Details

The main driver, **`HerencaExample.java`**, demonstrates two key OOP concepts:

1.  **Dynamic Binding:**
    The variable `a` is declared as type `A` but can hold instances of `B` or `C` based on user input.

2.  **Safe Downcasting:**
    The code explicitly checks the object type at runtime using `.getClass()` before casting to `C` to access the specific `sum()` method.

    ```java
    if (a.getClass() == C.class)
        System.out.println("SUM" + ((C)a).sum());
    ```

## 🛠️ How to Run

1.  Compile the source files.
2.  Run `HerencaExample`.
3.  **Input:** Enter an integer (`1`, `2`, or other) in the console to trigger different object instantiations.

---
*Created by [Tiago Pereira](https://github.com/TiagoPereira001)*
