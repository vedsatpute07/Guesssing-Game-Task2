# Number Guessing Game 🎯

A simple Java console-based Number Guessing Game where the player tries to guess a randomly generated number between **1 and 100**. The game provides hints after each guess and awards points based on the number of attempts taken.

## Features

- Random number generation between 1 and 100.
- User-friendly console interface.
- Input validation for non-numeric values.
- Range validation (1–100).
- Hint system:
  - **Greater** → Your guess is greater than the secret number.
  - **Smaller** → Your guess is smaller than the secret number.
  - **Right** → Correct guess.
- Scoring system based on attempts.

## Technologies Used

- Java
- `java.util.Random`
- `java.util.Scanner`

## How It Works

1. The program generates a random number between **1 and 100**.
2. The user enters a guess.
3. The game provides a hint:
   - `Greater` if the guess is too high.
   - `Smaller` if the guess is too low.
   - `Right` if the guess is correct.
4. The game continues until the correct number is guessed.
5. Points are awarded based on the number of attempts.

## Scoring System

| Attempts | Points |
|-----------|---------|
| 1 | 10 |
| 2 | 9 |
| 3 | 8 |
| 4 | 7 |
| 5 | 6 |
| 6 | 5 |
| 7 | 4 |
| 8 | 3 |
| 9 | 2 |
| 10+ | 1 |

## Project Structure

```text
task2.java
```

## Compilation and Execution

### Compile

```bash
javac task2.java
```

### Run

```bash
java task2
```

## Sample Output

```text
Guess the number (between 1 and 100):
Enter your guess: 50
Greater

Enter your guess: 25
Smaller

Enter your guess: 37
Right

Congratulations! You guessed it right!
Attempts: 3
Points earned: 8
```

## Code Overview

### `getRandomNumber()`
Generates and returns a random number between 1 and 100.

### `giveHint(int number, int guess)`
Compares the user's guess with the secret number and returns:
- `"Greater"`
- `"Smaller"`
- `"Right"`

### `runGuess()`
Handles:
- User input
- Input validation
- Guess checking
- Hint generation
- Score calculation

### `main()`
Entry point of the application that starts the game.

## Future Enhancements

- Multiple rounds support.
- Difficulty levels (Easy, Medium, Hard).
- High score tracking.
- Graphical User Interface (GUI).
- Multiplayer mode.

## Author

Developed as a Java programming practice project.# Guesssing-Game-Task2
