### **README.md**
```md
# Zoo Animal Simulation in Java

This project is a **console-based Zoo Animal Simulation** built in Java. It allows users to interact with different animal species (**Tiger, Dolphin, and Penguin**) by setting their properties and simulating actions like **walking, swimming, and eating**.

## Features:
- **Object-Oriented Design**: Uses **abstract classes, interfaces, and inheritance** to define animal behaviors.
- **User Interaction**: A **menu-driven interface** allows selecting animals and performing various actions.
- **Encapsulation & Polymorphism**: Implements getter/setter methods, method overriding, and interfaces (`Eat`, `Swim`, `Walk`).
- **Switch-Case Menu System**: Ensures smooth interaction with different animals.

## 🏗️ Classes:
- **`Animal`** (Abstract Class): Base class with common properties like name, weight, height, and age.
- **`Tiger`**: Implements **walking** and **eating** behaviors.
- **`Dolphin`**: Implements **swimming** and **eating** behaviors.
- **`Penguin`**: Implements **walking, swimming, and eating** behaviors.
- **`Main`**: Handles user input and manages the simulation.

## 🎭 Interfaces:
- **`Walk`**: Defines walking behavior.
- **`Swim`**: Defines swimming behavior.
- **`Eat`**: Defines eating-related behavior.

## 📌 How to Run:
1. **Clone the Repository**:
   ```sh
   git clone https://github.com/your-username/Zoo-Animal-Simulation.git
   ```
2. **Navigate to the Project Directory**:
   ```sh
   cd Zoo-Animal-Simulation
   ```
3. **Compile and Run the Program**:
   ```sh
   javac Main.java
   java Main
   ```
4. **Follow the on-screen menu** to select and interact with animals.

---

## 📝 Example Menu Interaction:
```
******* ZOO ANIMAL choice menu ******
1. Tiger
2. Dolphin
3. Penguin

Enter choice of animal: 1

******* ANIMAL details menu ******
1. Set properties
2. Display properties
3. Display movement
4. Display eating

Enter choice (1-4): 3
The animal Tiger is walking
```

---

## 📜 License
This project is open-source. Feel free to modify and use it for learning purposes.

---

🎉 **Enjoy exploring the Zoo Animal Simulation!** 🚀


