#include <iostream>
#include <string>
using namespace std;


int main() {

bool gameFinished = false;
string verb = "";
string object = "";
string playerName = "";
int playerHealth = 13;
int playerArmor = 0;
int playerDamage = 0;
int equipSword = 25;
int progress = 1;
int chestplate = 50;
int pauldrons = 50;
int peonHealth = 50;
int peonDamage = 7;


			cout << "Ladies and gentleman! Please welcome to the arena ... (Choose your name)" << endl;
			cin >> playerName;

			cout << playerName << ", What a beautiful name! Are you ready for your conquest hero? The battle arena awaits you!" << endl;

			while (verb != "quit" && !gameFinished) {


				if (progress == 1) {
					cout << "First, you need to equip some armor! Type in 'equip armor' to equip your steel iron chestplate and ruby pauldrons! " << endl;
					cin >> verb >> object;

					if (verb == "equip" && object == "armor") {
						playerArmor = chestplate + pauldrons + playerArmor;
						cout << "Your armor is " << playerArmor << endl;
						progress = 2;
					}
					else if (verb != "equip" && object != "armor") {
						cout << "no such command." << endl;
					}
				}
				else if (progress == 2) {
					cout << "Secondly , you need to wield a weapon! Type in 'equip weapon' to equip your mighty broadsword! " << endl;
					cin >> verb >> object;
					if (verb == "equip" && object == "weapon") {
						playerDamage = equipSword + playerDamage;
						cout << "Your damage has now improved!" << endl;
						progress = 3;
					}
				}
				if (peonHealth <= 0 || playerHealth <= 0) {
							peonHealth = 0;
							playerHealth = 0;
							cout << "You have defeated the peon!" << endl;
							break;
						}
				else if (progress == 3) {
					cout << "You have three enemies on the field. The first one is a lazy peon."<<endl;
					cout << "type 'attack peon' to attack the target." << endl;
					cin >> verb >> object;
						if (verb == "attack" && object == "peon") {
							cout << "You have successfully hit peon for " << playerDamage << " damage." << endl;
							peonHealth = peonHealth - playerDamage;
							cout << "Peon's health: " << peonHealth << "/50" << endl;
						}
						
					}
					
			}
	return 0;
}

