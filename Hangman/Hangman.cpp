#include <iostream>
#include <string>

using namespace std;

int main() {
	bool first = false;
	bool second = false;
	bool third = false;
	bool forth = false;
	bool fifth = false;
	string answer;
	int tries = 10;

	bool gameFinished = false;
	cout << "Welcome to HANGMAN! You have to guess the word that i've inputted." << endl;
	cout << "You have 10 tries. Use them wisely! " << endl;
	while (!gameFinished) {

		cin >> answer;

		if (answer == "c" &&first != false) {
			cout << "you have already guessed this letter try again." << endl;
		}
		else if (answer == "c" && first == false) {
			cout << "You have guessed the first letter! The first letter is C! " << endl;
			first = true;
		}
		if (answer == "h" && second != false) {
			cout << "you have already guessed this letter try again." << endl;
		}
		else if (answer == "h" && second == false) {
			cout << "You have guessed the second letter! The second letter is H! " << endl;
			second = true;
		}
		if (answer == "i" &&third != false) {
			cout << "you have already guessed this letter try again." << endl;
		}
		else if (answer == "i" && third == false) {
			cout << "You have guessed the third letter! The third letter is I! " << endl;
			third = true;
		}
		if (answer == "p" &&forth != false) {
			cout << "you have already guessed this letter try again." << endl;
		}
		else if (answer == "p" && forth == false) {
			cout << "You have guessed the forth letter! The forth letter is P! " << endl;
			forth = true;
		}
		if (answer == "sn" &&fifth != false) {
			cout << "you have already guessed this letter try again." << endl;
		}
		else if (answer == "s" && fifth == false) {
			cout << "You have guessed the fifth letter! The fifth letter is S! " << endl;
			fifth = true;
		}
		if (tries <= 1) {
			gameFinished = true;
		}



		if (first == true && second == true && third == true && forth == true && fifth == true) {
			cout << "You have guessed the word! The word is CHIPS!" << endl;
			gameFinished = true;
		}

		else if (answer != "c" &&answer != "h" &&answer != "i" &&answer != "p" &&answer != "s") {
			tries = tries - 1;
			cout << "There's no " << answer << " in the word" << endl;
			cout << "You have " << tries << " out of 10 tries left" << endl;
		}








	}



	return 0;
}