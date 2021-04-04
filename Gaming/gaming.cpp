#include "pch.h"
#include "orc.h"
#include "Tauren.h"
#include "Sorcerer.h"
#include <iostream>
#include <string>


using namespace std;

int main()
{
	int ownHp = 70;
	int ownDamage = 8;
	int standardHp = 70;
	int levelupHp = 35;
	int levelupDamage = 5;
	string answer;

	orc monster1 = orc("Kronthar");
	orc monster2 = orc("Sarkoth");
	Tauren monster3 = Tauren("Windhoof");
	Tauren monster4 = Tauren("Dustmane");
	cin >> answer;
	if (answer == "auto") {


		cout << "Your health is: |" << ownHp << "|" << endl;
		// Monster healthbar displayed/ your healthbar displayed
		cout << monster1.getName() << "'s health is: |" << monster1.getHp() << "|" << endl;

		cout << endl;
		//
		//forloop for first monster (orc)
		for (int i = monster1.getHp(); i > 0; i++) {
			cout << "Your current health is: |" << ownHp << "|" << endl;
			cout << monster1.getStatus() << endl;
			monster1.deal_dmg(ownDamage);
			cout << monster1.getName() << " has taken " << ownDamage << " physical damage" << endl;
			ownHp -= monster1.receive_dmg();
			cout << "You have taken " << monster1.receive_dmg() << " physical damage." << endl;
			cout << endl;
			// If monster dies
			if (monster1.getHp() <= 0) {


				cout << monster1.getName() << "has died." << endl;
				ownDamage = ownDamage + levelupDamage;
				standardHp = standardHp + levelupHp;
				ownHp = standardHp;
				cout << "You have successfully reached level 2!" << endl;
				cout << "Your damage has been increased!" << endl;
				cout << "Your health has regenerated and it's now " << ownHp << endl;

				cout << endl;
				break;
				//  if you die
			}
			if (ownHp <= 0) {
				cout << "You have died." << endl;
				break;
			}
		}
		// forloop for tauren
		for (int i = monster3.getHp(); i > 0; i++) {
			cout << "Your current health is: |" << ownHp << "|" << endl;
			cout << monster3.getStatus() << endl;
			monster3.deal_dmg(ownDamage);
			cout << monster3.getName() << " has taken " << ownDamage << " physical damage" << endl;
			ownHp -= monster3.receive_dmg();
			cout << "You have taken " << monster3.receive_dmg() << " physical damage." << endl;
			cout << endl;
			//if tauren dies
			if (monster3.getHp() <= 0) {


				cout << monster3.getName() << " has died." << endl;
				ownDamage = ownDamage + levelupDamage;
				standardHp = standardHp + levelupHp;
				ownHp = standardHp;
				cout << "You have successfully reached level 3!" << endl;
				cout << "Your damage has been increased!" << endl;
				cout << "Your health has regenerated and it's now " << ownHp << endl;

				cout << endl;
				break;
				//if you die.
			}
			if (ownHp <= 0) {
				cout << "You have died." << endl;
				break;
			}
		}
	}
	else if (answer == "manual") {


		cout << "Your health is: |" << ownHp << "|" << endl;
		// Monster healthbar displayed/ your healthbar displayed
		cout << monster1.getName() << "'s health is: |" << monster1.getHp() << "|" << endl;

		cout << endl;
		cout << "You got into a fight! type 'attack' to attack " << monster1.getName() << endl;
		for (int i = 0; i > monster1.getHp() || ownHp; i++) {


			cin >> answer;
			if (answer == "attack") {

				monster1.deal_dmg(ownDamage);
				cout << monster1.getName() << " has taken " << ownDamage << " physical damage" << endl;
				ownHp -= monster1.receive_dmg();
				cout << "You have taken " << monster3.receive_dmg() << " physical damage." << endl;
				cout << monster1.getStatus() << endl;
				cout << "Your current health is: |" << ownHp << "|" << endl;
				cout << endl;
				if (ownHp <= 0) {
					cout << "You have died." << endl;
					break;
				}
				if (monster1.getHp() <= 0) {


					cout << monster1.getName() << " has died." << endl;
					ownDamage = ownDamage + levelupDamage;
					standardHp = standardHp + levelupHp;
					ownHp = standardHp;
					cout << "You have successfully reached level 2!" << endl;
					cout << "Your damage has been increased!" << endl;
					cout << "Your health has regenerated and it's now " << ownHp << endl;

					cout << endl;
					break;


				}

			}
		}
	}
}

