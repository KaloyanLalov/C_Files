#include <iostream>
#include <string>
#include <time.h>

using namespace std;
int answer;
bool gameFinished = false;
int main() {



	cout << "I will generate a random number between 1 and 100 and you have to guess it" << endl;
	cout << "I will notify you if the number is higher or lower." << endl;

	srand(time(0));
		int number = rand() % 100 + 1;
	while (gameFinished == false) {
		cin >> answer;

		
		if (answer > number) {
			cout << "The number is smaller" << endl;


		}
		if (answer < number) {
			cout << "The number is bigger" << endl;

		}
		if (answer == number) {
			cout << "You have guessed the number!" << endl;
			gameFinished = true;
		}




	}
	return 0;
}
		

