# Hangman Game Mini-Project
## Overview
```
This mini-project involves creating a Hangman Game program in Java. The program prompts the user to enter a string (one single word or a short phrase), then allows the user to search for characters within that string. The program includes functionalities such as character search, counting character occurrences, and displaying the string with instances of the entered character. Additionally, the program has been modified to allow for further search characters to be entered one at a time until the user enters a blank string "".
```

### Exercise 1: Character Search
- Character Existence Check: Prompt the user to enter a single character and search the original string for that character. Output whether or not the character exists in the string.
Character Occurrence Count: Modify the program to search the string for the character and output how many times the character exists in the stored string.
Display String with Instances: Modify the program again to output the stored string, showing instances of the entered character and an underscore for the other remaining letters (spaces should be displayed as spaces). For example, the phrase "Hello World" with the chosen letter '1' would display: 11 1.
Input Validation: Add simple validation to prevent the user from entering punctuation characters in both the string and the search character (allow only letters a-z and spaces).
Additional Feature: Continuous Character Search
The program now allows for further search characters to be entered one at a time until the user enters a blank string "".

As each search character is entered, the program outputs the string with the characters entered showing or outputs a message if the character does not exist in the stored string.
Usage
.
Follow the prompts to enter the string and perform character searches as per the exercise requirements. Enter a blank string to quit the continuous character search feature.
Example Usage
```
Enter a string (letters and spaces only): Hello World
Enter a character (or press Enter to quit): l
_l_l_ _o_l_
Enter a character (or press Enter to quit): 1
Sorry, '1' does not exist in the phrase.
Enter a character (or press Enter to quit): e
_ell_ _o_l_
Enter a character (or press Enter to quit): 
Game over! Thanks for playing.
```
.
```
Notes
The program is case insensitive, treating uppercase and lowercase characters as equivalent.
Punctuation characters are not allowed in both the input string and the search characters.
The continuous character search feature allows the user to search for multiple characters in the stored string until they decide to quit by entering a blank string.
```