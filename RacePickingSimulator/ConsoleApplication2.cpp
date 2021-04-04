#include <iostream>
#include <time.h>
#include <string>
using namespace std;
int main() {
	srand(time(0));
	bool gamefinished = false;
	int restartprogram = 1;
	string wowclass = "";
	
	bool classbool = false;
	
	cout << "Choose your class - Mage, Warrior,Paladin." << endl;
	cin >> wowclass;
	while (wowclass != "quit" && !gamefinished) {
		int strength = rand() % 10 + 1;
		int agility = rand() % 10 + 1;
		int intellect = rand() % 10 + 1;
		int stamina = rand() % 10 + 1;
		int spirit = rand() % 10 + 1;
		int attackpower = rand() % 1000 + 1;
		int spellpower = rand() % 1000 + 1;

		if (wowclass == "mage") {
			classbool = true;
			cout << stamina << " stamina" << endl;
			cout << intellect << " intellect" << endl;
			cout << spirit << " spirit" << endl;
			cout << spellpower << " spell power" << endl;
			restartprogram = 2;
		}
		else if (wowclass == "warrior") {
			classbool = true;
			cout << stamina << " stamina" << endl;
			cout << strength << " strength" << endl;
			cout << agility << " agility" << endl;
			cout << attackpower << " attack power" << endl;
			cout << spirit << " spirit" << endl;
			restartprogram = 2;
		}
		else if (wowclass == "paladin") {
			classbool = true;
			cout << stamina << " stamina" << endl;
			cout << strength << " strength" << endl;
			cout << agility << " agility" << endl;
			cout << intellect << " intellect" << endl;
			cout << spirit << " spirit" << endl;
			cout << spellpower << " spell power" << endl;
			cout << attackpower << " attack power" << endl;
			restartprogram = 2;
		}
		cin >> wowclass;
		if (wowclass == "anotherclass") {
			classbool = false;
			restartprogram = 1;
		}
	}
	return 0;
}