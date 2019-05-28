# GUIGG
GUIGG Android

Project GUIGG.
Using the designer, add a TextView infoBox, a Plain Text inputBox , and two Buttons name “Guess” and “This is the secret number”.

The guessing game was programmed as follows.
The app takes a random secret number between 0 and100 and invites the user via a text in infoBox to guess.
The user types a number between 0 and 100 in inputBox and presses the button Guess when she is finished.
The app checks the value against its randomly chosen number and issues “Lower”, “Higher”, or “Correct!”  in infoBox,
accompanied by the number of guesses so far.This is repeated until the user has it right or the number of wrong guesses is 10.
In the latter case, infoBox shows a fail message and the secret number.

For easy testing, the following feature was added. When the user starts with entering a number in inputBox 
and presses the button "This is the secret number", the entered number will be taken as the secret number and the game starts from there.

//After the first guess is issued, the secret number should not be changed anymore.
//Therefore, the app will disable the button "This is the secret number" after the first guess.

