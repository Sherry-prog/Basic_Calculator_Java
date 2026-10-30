# Basic_Calculator_Java

# Java Console Calculator

A simple menu-driven calculator that runs in the terminal, written in plain Java with no external dependencies.

## Features

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`) with divide-by-zero protection
- Modulus (`%`) with modulus-by-zero protection
- Power (`^`)
- Input validation for menu choices and numbers
- Runs in a loop until you choose to exit

## Requirements

- Java Development Kit (JDK) 8 or newer

Check your installation:

```
java -version
javac -version
```

## How to Run

1. Put `Calculator.java` in a folder and open a terminal there.
2. Compile:

   ```
   javac Calculator.java
   ```

3. Run:

   ```
   java Calculator
   ```

## Example Session

```
===== Console Calculator =====
1. Addition       (+)
2. Subtraction    (-)
3. Multiplication (*)
4. Division       (/)
5. Modulus        (%)
6. Power          (^)
0. Exit
Choose an option: 1
Enter first number: 5
Enter second number: 3
Result: 5.0 + 3.0 = 8.0
```

## Error Handling

| Situation                  | Behavior                                  |
|----------------------------|-------------------------------------------|
| Division or modulus by 0   | Shows an error message and returns to menu |
| Non-numeric number input   | Asks again until a valid number is entered |
| Invalid menu choice        | Shows a message and redisplays the menu    |

## Project Structure

```
.
├── Calculator.java
└── README.md
```

## Possible Improvements

- Parse full expressions such as `5 + 3 * 2`
- Add square root, percentage and other functions
- Keep a history of past calculations
- Add unit tests with JUnit

## License

Free to use and modify for learning and personal projects.
