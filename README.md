# Number_Guessing_Game
Number Guessing Game
A fun console-based number guessing game written in Java where you try to guess a randomly generated number.
About
This is an interactive guessing game where the computer picks a random number between 0 and 100, and you have to guess it! The game provides helpful hints ("too high" or "too low") and tracks how many attempts it takes you to find the correct number.
Features

Random number generation (0-100)
Input validation for invalid entries
Helpful hints (too high/too low)
Attempt counter
Play multiple rounds
Clean console interface with emojis

How to Run

Clone or download the repository
Compile the Java file:
bashjavac NumberGuessingGame.java

Run the game:
bashjava NumberGuessingGame


How to Play

The computer selects a random number between 0 and 100
Enter your guess when prompted
The game will tell you if your guess is too high, too low, or correct
Keep guessing until you find the right number
Choose to play again or quit when the round ends

Example Gameplay
Welcome to the Number Guessing Game!

I've picked a number between 0 and 100. Try to guess it!
Your guess: 50
Too high! Try again.
Your guess: 25
Too low! Try again.
Your guess: 37
Too high! Try again.
Your guess: 31
🎉 Congratulations! You guessed the number in 4 tries.

Do you want to play again? (yes/no): yes

I've picked a number between 0 and 100. Try to guess it!
Your guess: 75
Too low! Try again.
Your guess: 90
🎉 Congratulations! You guessed the number in 2 tries.

Do you want to play again? (yes/no): no
Thanks for playing! Goodbye 👋
Code Features

Input Validation: Handles non-numeric input and out-of-range numbers
Range Checking: Ensures guesses are between 0 and 100
Attempt Tracking: Counts and displays number of tries
Replay Option: Ask to play multiple rounds
Clean Code: Well-structured with clear variable names

Technical Details

Language: Java
Libraries Used:

java.util.Scanner - User input handling
java.util.Random - Random number generation


Range: Numbers from 0 to 100 (inclusive)
Input: Accepts integer guesses and yes/no for replay

Requirements

Java 8 or higher

Author
Anurag Maji

GitHub: A-MAJI
Email: anuragmaji14@gmail.com


A simple Java project demonstrating user input, random numbers, and game logic
