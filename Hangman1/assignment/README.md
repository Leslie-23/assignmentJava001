# Hangman Game Mini-Project
## Overview
This mini-project involves creating a Hangman Game program in Java. The program prompts the user to enter a string (one single word or a short phrase), then allows the user to search for characters within that string. The program includes functionalities such as character search, counting character occurrences, and displaying the string with instances of the entered character.

### Exercise 1: Character Search
- Character Existence Check: Prompt the user to enter a single character and search the original string for that character. Output whether or not the character exists in the string.
- Character Occurrence Count: Modify the program to search the string for the character and output how many times the character exists in the stored string.
- Display String with Instances: Modify the program again to output the stored string, showing instances of the entered character and an underscore for the other remaining letters (spaces should be displayed as spaces). For example, the phrase "Hello World" with the chosen letter '1' would display: 11 1.
- Input Validation: Add simple validation to prevent the user from entering punctuation characters in both the string and the search character (allow only letters a-z and spaces).
#### Usage
Compile the Java program using a Java compiler (e.g., javac App.java).
Run the compiled program using java App.
Follow the prompts to enter the string and perform character searches as per the exercise requirements.
Example Usage
``` 
Enter a string (letters and spaces only): Hello World
Enter a single character (letter): l
Character exists in the string: true

Number of times the character appears in the string: 3
Display string with instances of the character: _ell_ _o_l_
Enter a single character (letter): 1
Invalid input! Enter a single letter: e
Character exists in the string: true

Number of times the character appears in the string: 1
Display string with instances of the character: _e___ _o_l_
Enter a single character (letter): !
Invalid input! Enter a single letter: h
Sorry, 'h' does not exist in the phrase.

Enter a single character (letter): (Press Enter to quit)
Game over! Thanks for playing.
Notes
```
.
```
The program is case insensitive, meaning it treats uppercase and lowercase characters as equivalent.
The Hangman Game loop allows the user to continue entering search characters until they enter a blank string to quit.
```